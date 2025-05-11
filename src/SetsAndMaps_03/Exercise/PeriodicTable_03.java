package SetsAndMaps_03.Exercise;

import java.util.*;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            elements.addAll(List.of(input));
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
