package com.umc;

public class ex6 {
    public static void main(String[] args) {

        int prodInt = 1;
        float prodFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                prodInt *= i;
                prodFloat *= i;
            }
        }

        System.out.println("Product of odd numbers (int): " + prodInt);
        System.out.println("Product of odd numbers (float): " + prodFloat);
    }
}
