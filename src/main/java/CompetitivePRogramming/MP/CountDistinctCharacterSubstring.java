package CompetitivePRogramming.MP;

import java.util.*;

public class CountDistinctCharacterSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long k = sc.nextLong();

        List<String> allSubstrings = findAllSubStrings(input);
        System.out.println(allSubstrings);

        int count = 0;
        for(String eachSubstr : allSubstrings) {
            if(eachSubstr.length() >= k
            && countAllDistinctChars(eachSubstr) == k) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static Long countAllDistinctChars(String eachSubstr) {
//        Set<Character> characterSet = new HashSet<>();
//        for(Character eachChar : eachSubstr.toCharArray()) {
//            characterSet.add(eachChar);
//        }
//        return characterSet.size();

        return eachSubstr.chars().distinct().count();
    }

    private static List<String> findAllSubStrings(String input) {
        List<String> allSubstrings = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            for(int j = i+1; j <=input.length(); j++) {
                allSubstrings.add(input.substring(i, j));
            }
        }
        return allSubstrings;

    }
}
