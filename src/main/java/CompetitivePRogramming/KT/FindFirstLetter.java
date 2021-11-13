package CompetitivePRogramming.KT;

import java.util.Scanner;

public class FindFirstLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        printFirstLetterOfEachWord(str);
    }

    private static void printFirstLetterOfEachWord(String str) {
        String[] arr = str.split(" ");

        for(String eachWord : arr) {

            System.out.print(eachWord.charAt(0));
        }
    }
}
