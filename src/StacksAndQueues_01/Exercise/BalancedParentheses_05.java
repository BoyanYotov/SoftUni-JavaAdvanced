package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean isMatching = false;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(' || symbol == '{' || symbol == '[') {
                openBrackets.push(symbol);
            } else if (symbol == ')' && !openBrackets.isEmpty()) {
                if (openBrackets.peek() == '(') {
                    openBrackets.pop();
                    isMatching = true;
                } else {
                    isMatching = false;
                }
            } else if (symbol == '}' && !openBrackets.isEmpty()) {
                if (openBrackets.peek() == '{') {
                    openBrackets.pop();
                    isMatching = true;
                } else {
                    isMatching = false;
                }
            } else if (symbol == ']' && !openBrackets.isEmpty()) {
                if (openBrackets.peek() == '[') {
                    openBrackets.pop();
                    isMatching = true;
                }
            } else {
                isMatching = false;
            }
        }

        if (isMatching) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
