package SetsAndMaps_03.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> register = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                register.put(input, email);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());

        }
    }
}
