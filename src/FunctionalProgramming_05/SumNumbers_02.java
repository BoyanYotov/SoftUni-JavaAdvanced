package FunctionalProgramming_05;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toList();

        Function<List<Integer>,Integer> sumFunction = list -> {
            int sum = 0;
            for (Integer i : list) {
                sum  += i;
            }
            return sum;
        };

        System.out.printf("Count = %d%n",numbers.size());
        System.out.printf("Sum = %d",sumFunction.apply(numbers));



    }
}
