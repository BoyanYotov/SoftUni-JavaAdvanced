package MultidimentionalArrays_02.Lab;

import java.util.Scanner;

public class PositionOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);

        int number = scanner.nextInt();
        boolean isFound = false;
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
