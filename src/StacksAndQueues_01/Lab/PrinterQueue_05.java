package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String command = scanner.nextLine();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (!printerQueue.isEmpty()) {
                    System.out.printf("Canceled %s\n", printerQueue.pop());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                printerQueue.offer(command);
            }

            command = scanner.nextLine();
        }

        printerQueue.forEach(System.out::println);
    }
}
