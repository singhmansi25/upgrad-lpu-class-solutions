package CompetitivePRogramming.KT;

import java.util.*;

public class CountSubStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        String input = sc.next();
        List<String> allSubStrings = getAllPossibleSubstrings(input);
        System.out.println(allSubStrings);

        int count = 0;
        for(String eachSubstr : allSubStrings) {
            if(eachSubstr.length() >= k
            && getDistinctCharCount(eachSubstr) == k) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static long getDistinctCharCount(String eachSubstr) {

//        Set<Character> characterSet = new HashSet<>();
//        for(int i = 0; i < eachSubstr.length(); i++) {
//            characterSet.add(eachSubstr.charAt(i));
//        }
//        return characterSet.size();


        return eachSubstr.chars().distinct().count();



    }

    private static List<String> getAllPossibleSubstrings(String input) {

        List<String> allSubStrings = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                allSubStrings.add(input.substring(i, j));
            }
        }
        return allSubStrings;

    }
}
