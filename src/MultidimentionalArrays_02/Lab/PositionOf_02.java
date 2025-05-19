package MultidimentionalArrays_02.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimentions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimentions[0];
        int cols = dimentions[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix,scanner);

        int number = Integer.parseInt(scanner.nextLine());
        searchForNumber(matrix,number);
    }

    private static void searchForNumber(int[][] matrix, int number) {
        boolean isFound = false;

        for (int i = 0; i <= matrix.length - 1 ; i++) {
            for (int j = 0; j <= matrix[0].length - 1 ; j++) {
                int currentNumber = matrix[i][j];

                if (currentNumber == number){
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i <= matrix.length - 1 ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
