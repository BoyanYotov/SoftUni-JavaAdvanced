package SetsAndMaps_03.Exercise;

import java.util.*;

public class HandOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
                players.get(name).addAll(List.of(cards));
            } else {
                players.get(name).addAll(List.of(cards));
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : players.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), calculatePower(entry.getValue()));
        }
    }

    private static int calculatePower(Set<String> entry) {
        int totalPower = 0;

        for (String card : entry) {

            int power = 0;
            int type = 0;

            if (card.startsWith("10")) {
                power = 10;
                type = returnNumberValue(card.charAt(2));
            } else {
                power = returnNumberValue(card.charAt(0));
                type = returnNumberValue(card.charAt(1));
            }

            totalPower += power * type;
        }

        return totalPower;
    }

    private static int returnNumberValue(char power) {
        int value = 0;
        switch (power) {
            case '1' -> value = 1;
            case '2' -> value = 2;
            case '3' -> value = 3;
            case '4' -> value = 4;
            case '5' -> value = 5;
            case '6' -> value = 6;
            case '7' -> value = 7;
            case '8' -> value = 8;
            case '9' -> value = 9;
            case 'J' -> value = 11;
            case 'Q' -> value = 12;
            case 'K' -> value = 13;
            case 'A' -> value = 14;
            case 'S' -> value = 4;
            case 'H' -> value = 3;
            case 'D' -> value = 2;
            case 'C' -> value = 1;
            default -> value = 10;
        }
        return value;
    }
}
