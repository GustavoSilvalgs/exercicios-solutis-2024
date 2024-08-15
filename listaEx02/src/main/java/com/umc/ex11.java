package com.umc;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = sc.nextLine();

        int comparison = word1.compareTo(word2);

        System.out.println("Words in alphabetical order:");
        if (comparison < 0) {
            System.out.println(word1);
            System.out.println(word2);
        } else if (comparison > 0) {
            System.out.println(word2);
            System.out.println(word1);
        } else {
            System.out.println("Both words are the same.");
        }
        
        if (word1.length() > word2.length()) {
            System.out.println("The first word has more characters");
        } else if (word1.length() < word2.length()) {
            System.out.println("The second word has more characters");
        } else {
            System.out.println("Both words have the same number of characters.");
        }
    }
}
