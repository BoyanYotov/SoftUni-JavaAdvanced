package MultidimentionalArrays_02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int [3][3];
        matrix[0] = new int[] {1,2,3};
        matrix[1] = new int[] {4,5,6};
        matrix[2] = new int[] {7,8,9};

        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[row].length - 1 ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        int[] column2 = new int[matrix.length];

        for (int row = 0; row <= matrix.length - 1 ; row++) {
            column2[row] = matrix[row][1];;
        }

        for (int i = 0; i <= column2.length-1; i++) {
            System.out.print(column2[i] + " ");
        }
    }

}

