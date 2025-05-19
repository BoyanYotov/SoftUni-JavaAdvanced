package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String currentURL = "";

        while (!input.equals("Home")) {

            if (input.equals("back") && (browserHistory.size() >= 2)) {
                browserHistory.pop();
                currentURL = browserHistory.peek();
                System.out.println(currentURL);

            } else if (input.equals("back")) {
                System.out.println("no previous URLs");
            } else {
                browserHistory.push(input);
                currentURL = input;
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }

    }
}
