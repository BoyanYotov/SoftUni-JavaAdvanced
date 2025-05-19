package MultidimentionalArrays_02.Lab;

import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] firstMatrixDimentions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int rows1 = firstMatrixDimentions[0];
//        int cols1 = firstMatrixDimentions[1];

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        fillMatrix(matrix1, scanner);

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];
        fillMatrix(matrix2, scanner);

        if (compareMatrices(matrix1, matrix2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean compareMatrices(int[][] matrix1, int[][] matrix2) {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            return false;
        } else {
            for (int r = 0; r <= matrix1.length - 1; r++) {
                for (int c = 0; c <= matrix1[0].length - 1; c++) {
                    int currentNumber = matrix1[r][c];
                    if (currentNumber != matrix2[r][c]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int r = 0; r <= matrix.length - 1; r++) {
            for (int c = 0; c <= matrix[0].length - 1; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

//        for (int i = 0; i <= matrix.length - 1 ; i++) {
//            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        }
    }
}
