package SetsAndMaps_03.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            phonebook.put(name, number);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        while (!name.equals("stop")) {

            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }

//            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
//
//                if (phonebook.containsKey(name)) {
//                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
//                } else {
//                    System.out.printf("Contact %s does not exist.%n", name);
//                }

            name = scanner.nextLine();
        }
    }
}

