package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);
            if (commandNumber == 1) {
                long numberToPush = Integer.parseInt(command.split("\\s+")[1]);
                stack.push(numberToPush);

            } else if (commandNumber == 2) {
                stack.pop();

            } else if (commandNumber == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
