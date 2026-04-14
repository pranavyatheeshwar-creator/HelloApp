package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 10;

        double[] salary = new double[SIZE];
        double[] years = new double[SIZE];
        double[] bonus = new double[SIZE];
        double[] newSalary = new double[SIZE];

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Input
        for (int i = 0; i < SIZE; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            if (salary[i] <= 0) {
                System.err.println("Invalid salary");
                i--;
                continue;
            }

            System.out.print("Enter years of service: ");
            years[i] = input.nextDouble();

            if (years[i] < 0) {
                System.err.println("Invalid years of service");
                i--;
            }
        }

        // Calculation
        for (int i = 0; i < SIZE; i++) {

            double rate;

            if (years[i] > 5) {
                rate = 0.05;
            } else {
                rate = 0.02;
            }

            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        // Output
        System.out.println("\n--- EMPLOYEE REPORT ---");

        for (int i = 0; i < SIZE; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years: " + years[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}