package SetsAndMaps_03.Lab;

import java.util.*;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer > counter = new LinkedHashMap<>();

        for (int i = 0; i < input.length ; i++) {
            double currentNumber = input[i];

            if (!counter.containsKey(currentNumber)){
                counter.put(currentNumber,1);
            } else {
                int currentCount = counter.get(currentNumber);
                counter.put(currentNumber, currentCount + 1);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : counter.entrySet()) {
            System.out.printf("%.1f -> %d%n",doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }

    }
}
