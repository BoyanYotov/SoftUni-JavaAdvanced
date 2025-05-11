package FunctionalProgramming_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> prices = Arrays.stream(scanner.nextLine()
                .split(", ")).map(Double::parseDouble).collect(Collectors.toList());

        System.out.println("Prices with VAT:");

//        prices.forEach(price -> System.out.printf("%.2f%n",price * 1.2));

        Function<Double, Double> vatAddedFunction = price -> price * 1.2;

        for (Double price : prices) {
            System.out.printf("%.2f%n",vatAddedFunction.apply(price));
        }
    }
}
