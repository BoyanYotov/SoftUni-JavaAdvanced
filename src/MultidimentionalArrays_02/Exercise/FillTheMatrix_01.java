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
            fillMatrixPatternA(matrix);
            printMatrix(matrix);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);
            printMatrix(matrix);
        }

    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int startNumber = 1;
        for (int i = 0; i <= matrix[0].length - 1; i++) {
            if (i % 2 != 0){
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = startNumber++;
                }
            } else {
                for (int j = 0; j <= matrix.length - 1; j++) {
                    matrix[j][i] = startNumber++;
                }
            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int startNumber = 1;
        for (int i = 0; i <= matrix[0].length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                matrix[j][i] = startNumber++;
            }
        }
    }
}
