package com.umc;

public class ex8 {
    public static void main(String[] args) {

        String word = "arara";

        if (palindrome(word)) {
            System.out.println(word + " can be read from both sides");
        } else {
            System.out.println(word + " can't be read from both sides");
        }
    }

    private static boolean palindrome(String word) {

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
