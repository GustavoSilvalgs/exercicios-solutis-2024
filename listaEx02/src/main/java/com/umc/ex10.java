package com.umc;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine().toLowerCase();

        int vowels = 0;
        int spaces = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                else {
                    consonants++;
                }
            } else if (ch == ' '){
                spaces++;
            }
        }

        System.out.println("Numbers of vowels: " + vowels);
        System.out.println("Numbers of spaces: " + spaces);
        System.out.println("Numbers of consonants: " + consonants);
    }
}
