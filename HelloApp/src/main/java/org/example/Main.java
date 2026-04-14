package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        boolean isLeap = false;

        // Check Gregorian rule
        if (year >= 1582) {

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}