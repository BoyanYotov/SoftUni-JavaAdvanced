package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> indices = new ArrayDeque<>();
        List<String> substrings = new ArrayList<>();
        int openingIndex = 0;
        int closingIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '(') {
                indices.push(i);
                continue;
            } else if (currentSymbol == ')') {
                closingIndex = i;
                openingIndex = indices.pop();
            } else {
                continue;
            }

            String expression = input.substring(openingIndex, closingIndex + 1);
            substrings.add(expression);
        }

        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
