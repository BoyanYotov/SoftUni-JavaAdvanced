package MultidimentionalArrays_02.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char [][] matrixA = new char [rows][cols];
        char [][] matrixB = new char[rows][cols];

        fillMatrix(matrixA,scanner);
        fillMatrix(matrixB,scanner);

        for (int row = 0; row < matrixA.length ; row++) {
            for (int col = 0; col < matrixA[row].length ; col++) {
                if (matrixA[row][col] == matrixB[row][col]){
                    System.out.print(matrixA[row][col] + " ");
                } else {
                    System.out.print("*"+ " ");
                }
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrixA, Scanner scanner) {

        for (int row = 0; row < matrixA.length ; row++) {
            String inputA = scanner.nextLine().replace(" ","");
            char[] rowA = inputA.toCharArray();
            matrixA[row] = rowA;
        }
    }
}
