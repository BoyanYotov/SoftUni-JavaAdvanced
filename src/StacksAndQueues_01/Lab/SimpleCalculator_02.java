package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ArrayDeque<String> expressions = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .collect(Collectors.toCollection(ArrayDeque::new));

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        fillTheStack(input, stack);

        int result = 0;

        while (!stack.isEmpty()) {
            String currentSymbol = stack.peek();

            if (currentSymbol.equals("+")) {
                stack.pop();
                result += Integer.parseInt(stack.pop());
            } else if (currentSymbol.equals("-")) {
                stack.pop();
                result -= Integer.parseInt(stack.pop());
            } else {
                result += Integer.parseInt(stack.pop());
            }
        }

        System.out.println(result);

    }

    private static void fillTheStack(String[] input, ArrayDeque<String> stack) {
        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }
    }
}
