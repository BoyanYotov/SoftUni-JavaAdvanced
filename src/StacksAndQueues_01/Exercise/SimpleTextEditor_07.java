package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String input[] = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("1")) {
                String argument = input[1];
                stack.push(text.toString());
                text.append(argument);


            } else if (command.equals("2")) {
                int argument = Integer.parseInt(input[1]);
                stack.push(text.toString());
                text.replace(text.length() - argument, text.length(), "");


            } else if (command.equals("3")) {
                int index = Integer.parseInt(input[1]) - 1;
                System.out.println(text.charAt(index));

            } else if (command.equals("4")) {
                if (!stack.isEmpty()) {
                    text = new StringBuilder(stack.peek());
                    stack.pop();
                } else {
                    text = new StringBuilder();
                }
            }
        }
    }
}
