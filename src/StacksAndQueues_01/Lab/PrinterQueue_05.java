package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filename = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!filename.equals("print")) {

            if (filename.equals("cancel")) {
                if (!printerQueue.isEmpty()) {
                    System.out.printf("Canceled %s%n", printerQueue.peek());
                    printerQueue.poll();
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                printerQueue.offer(filename);
            }
            filename = scanner.nextLine();
        }

        for (String file : printerQueue) {
            System.out.println(file);
        }
    }
}
