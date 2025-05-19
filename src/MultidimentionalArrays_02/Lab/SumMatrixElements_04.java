package MultidimentionalArrays_02.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] size = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        int [][] matrix = new int[rows][cols];

        fillMatrix(matrix,scanner);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(calculateSumOfElements(matrix));

    }

    private static int calculateSumOfElements(int[][] matrix) {
        int sum = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length ; cols++) {
                sum += matrix[rows][cols];
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length ; i++) {
            int[] row = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }
    }
}
