package com.umc;

public class ex7 {
    public static void main(String[] args) {

        System.out.println("Division by 2 of multiples of 3 (int):");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultInt = i /2;
                System.out.print(resultInt + " ");
            }
        }

        System.out.println("\nDivision by 2 of multiples of 3 (double):");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultDouble = (double) i /2;
                System.out.print(resultDouble + " ");
            }
        }
    }
}
