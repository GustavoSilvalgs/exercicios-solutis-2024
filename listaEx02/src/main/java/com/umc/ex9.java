package com.umc;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        long roundedArea = Math.round(area);

        System.out.println("The area of the circle is: " + roundedArea);

        sc.close();
    }
}
