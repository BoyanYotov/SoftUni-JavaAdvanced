package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawInput = scanner.nextLine();
        String [] input = rawInput.split("");
        ArrayDeque<Integer> openBracketsIndices = new ArrayDeque<>();
        ArrayDeque<String> results = new ArrayDeque<>();

        for (int i = 0; i <= input.length - 1 ; i++) {
            String symbol = input[i];
            if (symbol.equals("(")){
                openBracketsIndices.push(i);
            } else if (symbol.equals(")")){
                int endIndex = i;
                String substring = rawInput.substring(openBracketsIndices.pop(),endIndex + 1);
                results.offer(substring);
            }
        }

        results.forEach(System.out::println);
    }
}
