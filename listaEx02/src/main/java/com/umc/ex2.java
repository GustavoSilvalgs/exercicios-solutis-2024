package com.umc;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = sc.nextInt();
        System.out.print("Enter the first value: ");
        int value2 = sc.nextInt();

        int largest;

        largest = Math.max(value1, value2);

        System.out.println("Highest value = " + largest);

        sc.close();
    }
}
