package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of 5 numbers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input with validation
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }

        input.close();
    }
}