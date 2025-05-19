package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if (command.length > 1) {
                int elementToPush = command[1];
                stack.push(elementToPush);
            } else if (command[0] == 2) {
                stack.pop();
            } else if (command[0] == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
