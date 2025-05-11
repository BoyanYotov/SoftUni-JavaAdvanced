package MultidimentionalArrays_02.Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix, n, scanner);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix, n, scanner);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix, int n, Scanner scanner) {
        int numberB = 1;
        for (int col = 0; col < n; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = numberB++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = numberB++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix, int n, Scanner scanner) {
        int numberA = 1;
        for (int cols = 0; cols < n; cols++) {
            for (int rows = 0; rows < n; rows++) {
                matrix[rows][cols] = numberA++;
            }
        }
    }
}
