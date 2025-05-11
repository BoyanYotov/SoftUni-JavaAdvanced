package FunctionalProgramming_05;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bounds = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();


        if (command.equals("even")){
            printNumbers(bounds,number -> number % 2 == 0);
        } else if (command.equals("odd")){
            printNumbers(bounds,number -> number % 2 != 0);
        }

    }
    private static void printNumbers (int[] bounds, Predicate<Integer> condition){
        for (int i = bounds[0]; i <= bounds[1] ; i++) {
            if (condition.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
