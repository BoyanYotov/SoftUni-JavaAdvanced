package MultidimentionalArrays_02.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2X2Submatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int r = input[0];
        int c = input[1];
        int[][] matrix = new int[r][c];

        fillMatrix(matrix, scanner);

        int sumOfSubMatrix = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sumOfSubMatrix = 0;
                sumOfSubMatrix += matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sumOfSubMatrix > maxValue) {
                    maxValue = sumOfSubMatrix;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        printMaxSubmatrix(matrix, maxRow, maxCol);
        System.out.println(maxValue);

    }

    private static void printMaxSubmatrix(int[][] matrix, int maxRow, int maxCol) {
        for (int r = maxRow; r <= maxRow + 1; r++) {
            for (int c = maxCol; c <= maxCol + 1; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }


    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            int[] matrixRowToFill = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRowToFill;
        }
    }
}