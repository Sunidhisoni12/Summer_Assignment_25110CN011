//ques78. write a program to check symmetric matrix

import java.util.*;

public class ques78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Symmetric matrix must be square
        if (rows != cols) {
            System.out.println("Matrix is not symmetric.");
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Matrix is symmetric.");
        } else {
            System.out.println("Matrix is not symmetric.");
        }

        sc.close();
    }
}