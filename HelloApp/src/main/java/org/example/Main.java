package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {

            int number = input.nextInt();

            boolean isEven = (number % 2 == 0);

            System.out.println("Is number even? " + isEven);

        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        input.close();
    }
}