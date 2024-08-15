package com.umc;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();

        double km = miles * 1.609;

        System.out.println(miles + " miles is equal to " + km + " km");

        sc.close();
    }
}
