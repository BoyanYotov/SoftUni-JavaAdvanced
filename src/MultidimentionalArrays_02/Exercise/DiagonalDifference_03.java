package MultidimentionalArrays_02.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);
        System.out.println(Math.abs(calculatePrimaryDiagonal(matrix) - calculateSecondaryDiagonal(matrix)));

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int r = 0; r < matrix.length; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRow;
        }
    }

    private static int calculatePrimaryDiagonal(int[][] matrix) {
        int sumA = 0;

        for (int r = 0; r < matrix.length; r++) {
            sumA += matrix[r][r];
        }

        return sumA;
    }

    private static int calculateSecondaryDiagonal(int[][] matrix) {
        int sumB = 0;
        int counter = 0;
        for (int r = matrix.length - 1; r >= 0; r--) {
            sumB += matrix[r][counter];
            counter++;
        }
        return sumB;
    }
}
