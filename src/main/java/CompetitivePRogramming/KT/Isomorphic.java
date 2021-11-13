package CompetitivePRogramming.KT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Isomorphic {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(isStringsIsomorphic(str1, str2));
    }

    private static boolean isStringsIsomorphic(String str1, String str2) {

        if(str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> characterMap = new HashMap<>();
        boolean result = true;

        for(int i = 0; i < str1.length(); i++) {
            if(characterMap.containsKey(str1.charAt(i))) {
                if(characterMap.get(str1.charAt(i)) != str2.charAt(i)) {
                    result = false;
                    break;
                }
            }
            else {
                characterMap.put(str1.charAt(i), str2.charAt(i));
            }
        }
        return result;
    }
}
