package MultidimentionalArrays_02.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        int sumMiniMatrix = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxMatrixRows = 0;
        int maxMatrixCols = 0;

        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < (matrix[r].length) - 2; c++) {
                sumMiniMatrix += matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2] +
                        matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2] +
                        matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r + 2][c + 2];

                if (sumMiniMatrix > maxValue) {
                    maxValue = sumMiniMatrix;
                    maxMatrixRows = r;
                    maxMatrixCols = c;
                }
                sumMiniMatrix = 0;
            }
        }

        printMaxMatrix(maxMatrixRows, maxMatrixCols, matrix);
    }

    private static void printMaxMatrix(int maxMatrixRows, int maxMatrixCols, int[][] matrix) {
        for (int i = maxMatrixRows; i <= maxMatrixRows + 2; i++) {
            for (int j = maxMatrixCols; j <= maxMatrixCols + 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            int[] rowMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = rowMatrix;
        }
    }
}
