package FunctionalProgramming_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCase = word -> Character.isUpperCase(word.charAt(0));

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).filter(upperCase).toList();

        System.out.println(input.size());
        input.forEach(word -> System.out.println(word));
    }
}
