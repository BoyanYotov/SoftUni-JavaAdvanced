package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_v02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '[' || currentSymbol == '(' || currentSymbol == '{') {
                openBrackets.push(currentSymbol);
            } else if (openBrackets.isEmpty() || !matchingBrackets(openBrackets, currentSymbol)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    private static boolean matchingBrackets(ArrayDeque<Character> openBrackets, char currentSymbol) {
        if ((currentSymbol == '}' && openBrackets.pop() == '{') ||
                (currentSymbol == ']' && openBrackets.pop() == '[') ||
                (currentSymbol == ')' && openBrackets.pop() == '(')) {
            return true;
        }
        return false;
    }
}
