package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_v01_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean isMatching = false;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '[' || currentSymbol == '(' || currentSymbol == '{') {
                openBrackets.push(currentSymbol);
            } else if (currentSymbol == ')') {
                if (!openBrackets.isEmpty() && openBrackets.peek() == '(') {
                    isMatching = true;
                    openBrackets.pop();
                } else {
                    isMatching = false;
                }
            } else if (currentSymbol == ']') {
                if (!openBrackets.isEmpty() && openBrackets.peek() == '[') {
                    isMatching = true;
                    openBrackets.pop();
                } else {
                    isMatching = false;
                }
            } else if (currentSymbol == '}') {
                if (!openBrackets.isEmpty() && openBrackets.peek() == '{') {
                    isMatching = true;
                    openBrackets.pop();
                } else {
                    isMatching = false;
                }
            }
        }

        if (isMatching) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
