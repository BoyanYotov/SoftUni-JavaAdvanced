package SetsAndMaps_03.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> counter = new TreeMap<>();

        for (char symbol : input) {
            if (!counter.containsKey(symbol)){
                counter.put(symbol,1);
            } else {
                int currentCount = counter.get(symbol);
                counter.put(symbol, currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());

        }

    }
}
