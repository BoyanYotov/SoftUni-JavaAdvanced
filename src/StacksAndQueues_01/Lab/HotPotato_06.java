package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));
        int n = Integer.parseInt(scanner.nextLine());

        while (names.size() > 1) {

            for (int i = 1; i < n; i++) {
                String currentName = names.poll();
                names.offer(currentName);
            }

            System.out.println("Removed " + names.poll());
        }

        System.out.println("Last is " + names.peek());
    }
}
