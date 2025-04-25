package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> currentText = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            String argument = "";

            switch (command){
                case "1":
                    currentText.push(text.toString());
                    argument = input.split("\\s+")[1];
                    text.append(argument);
                currentText.push(text.toString());
                break;
                case "2":
                    currentText.push(text.toString());
                    argument = input.split("\\s+")[1];
                    int startIndexToDelete =text.length() - Integer.parseInt(argument);
                    text.delete(startIndexToDelete, text.length());
                    currentText.push(text.toString());
                    break;
                case "3":
                    argument = input.split("\\s+")[1];
                    System.out.println(text.charAt(Integer.parseInt(argument) - 1));
                break;
                case "4":
                    text = new StringBuilder(currentText.pop());
            }
        }
    }
}
