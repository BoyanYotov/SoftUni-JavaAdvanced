package MultidimentionalArrays_02.Lab;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        readTheMatrix(matrix,scanner);

        printPrimaryDiagonal(matrix,scanner);
        System.out.println();
        printSecondaryDiagonal(matrix,scanner);
    }

    private static void printSecondaryDiagonal(int[][] matrix, Scanner scanner) {
        int col = 0;
        for (int i = matrix.length - 1; i >= 0 ; i--) {
            System.out.print(matrix[i][col] + " ");
            col++;
        }
    }

    private static void printPrimaryDiagonal(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    private static void readTheMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }
    }
}
