package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Fixed size array for 10 students
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");

        // Input with validation
        for (int i = 0; i < ages.length; i++) {

            ages[i] = input.nextInt();

            // Validate age
            if (ages[i] < 0) {
                System.err.println("Invalid age entered!");
                System.exit(0);
            }
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " can vote (Age: " + ages[i] + ")");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote (Age: " + ages[i] + ")");
            }
        }

        input.close();
    }
}