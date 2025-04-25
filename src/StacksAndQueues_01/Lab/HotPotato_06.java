package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> hotPotato = new ArrayDeque<>();

        for (String name : names) {
            hotPotato.offer(name);
        }

        while (hotPotato.size() > 1) {

            for (int i = 1; i <= rotations; i++) {
                String firstName = hotPotato.poll();

                if (i % rotations != 0) {
                    hotPotato.offer(firstName);
                } else {
                    System.out.println("Removed " + firstName);
                }
            }
        }

        System.out.println("Last is " + hotPotato.poll());
    }
}
