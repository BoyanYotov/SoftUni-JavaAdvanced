package MultidimentionalArrays_02.Lab;

import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsMatrix1 = scanner.nextInt();
        int colsMatrix1 = scanner.nextInt();

        int[][] matrix1 = new int[rowsMatrix1][colsMatrix1];

        fillUpMatrix(matrix1, scanner);

        int rowMatrix2 = scanner.nextInt();
        int colMatrix2 = scanner.nextInt();

        int[][] matrix2 = new int[rowMatrix2][colMatrix2];

        fillUpMatrix(matrix2, scanner);

        boolean areEqual = checkIfEqual(matrix1, matrix2);

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean checkIfEqual(int[][] matrix1, int[][] matrix2) {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            return false;
        }

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void fillUpMatrix(int[][] matrix1, Scanner scanner) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix1[row][col] = scanner.nextInt();
            }
        }
    }
}
