package SetsAndMaps_03.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondtSet = new LinkedHashSet<>();

        for (int i = 1; i <= n ; i++) {
            firstSet.add(scanner.nextInt());
        }

        for (int i = 1; i <= m ; i++) {
            secondtSet.add(scanner.nextInt());
        }

        for (Integer i : firstSet) {
            if (secondtSet.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
