package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid input. Number must be positive.");
            System.exit(0);
        }

        // Temporary variable for processing digits
        int tempNumber = number;

        // Count digits in the number
        int digitCount = 0;
        while (tempNumber > 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Array to store digits
        int[] digits = new int[digitCount];

        // Reset temp variable
        tempNumber = number;

        // Extract digits and store in array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // Close scanner
        input.close();
    }
}