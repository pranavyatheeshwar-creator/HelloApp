package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input salary
        System.out.println("Enter salary:");
        double salary = input.nextDouble();

        // Input years of service
        System.out.println("Enter years of service:");
        int years = input.nextInt();

        double bonus = 0.0;

        // Check eligibility
        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }

        input.close();
    }
}