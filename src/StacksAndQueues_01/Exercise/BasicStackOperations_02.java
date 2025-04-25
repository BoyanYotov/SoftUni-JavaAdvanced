package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nsxNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = nsxNumbers[0];
        int s = nsxNumbers[1];
        int x = nsxNumbers[2];
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            stackOfNumbers.push(currentNumber);
        }

        for (int i = 0; i < s; i++) {
            stackOfNumbers.pop();
        }

        if (stackOfNumbers.contains(x)) {
            System.out.println("true");
        } else if (stackOfNumbers.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(stackOfNumbers));
        }

    }
}
