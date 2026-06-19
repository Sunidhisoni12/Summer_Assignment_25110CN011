//ques76. write a program to find diagonal sum

import java.util.*;

public class ques76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;

        // Check if matrix is square
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                diagonalSum += matrix[i][i]; // Principal diagonal
            }

            System.out.println("Diagonal Sum = " + diagonalSum);
        } else {
            System.out.println("Diagonal sum can only be found for a square matrix.");
        }

        sc.close();
    }
}