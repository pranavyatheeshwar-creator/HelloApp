package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Fixed size matrix (3x3)
        int rows = 3;
        int cols = 3;

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter 3x3 matrix values:");

        // Input matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = input.nextInt();
            }
        }

        int sum = 0;

        System.out.println("\nMatrix is:");

        // Display + sum
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }

            System.out.println();
        }

        System.out.println("\nSum of matrix elements = " + sum);

        input.close();
    }
}