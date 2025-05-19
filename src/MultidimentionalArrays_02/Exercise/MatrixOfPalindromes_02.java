package MultidimentionalArrays_02.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        String[][] matrix = new String[r][c];

        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix) {


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                char firstLetter = (char) (97 + r);
                char secondLetter = (char) (97 + c + r);
                char thirdLetter = (char) (97 + r);
                String cell = "" + firstLetter + secondLetter + thirdLetter;

                matrix[r][c] = cell;
            }
        }

    }
}
