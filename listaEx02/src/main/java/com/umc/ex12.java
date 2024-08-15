package com.umc;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int km = 0;
        int litersOfGasoline = 0;

        System.out.print("Enter the number of full tanks: ");
        int numTanks = sc.nextInt();

        for (int tank = 1; tank <= numTanks; tank++) {
            System.out.print("Enter the kilometers driven in tank " + tank + ": ");
            int kilometers = sc.nextInt();

            System.out.print("Enter the amount of liters of gasoline consumed in tank " + tank + ": ");
            int liters = sc.nextInt();

            double consumption = (double) kilometers / liters;
            System.out.println("Consumption in tank " + tank + ": " + consumption + " km/l");

            km += kilometers;
            litersOfGasoline += liters;
        }

        double overallConsumption = (double) km / litersOfGasoline;
        System.out.println("\nOverall combined consumption: " + overallConsumption + " km/l");
        System.out.println("Total kilometers driven: " + km + " km");
        System.out.println("Total liters of gasoline consumed: " + litersOfGasoline + " liters");
    }
}
