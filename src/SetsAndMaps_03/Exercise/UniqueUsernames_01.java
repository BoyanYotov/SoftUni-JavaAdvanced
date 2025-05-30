package SetsAndMaps_03.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 1; i <= n ; i++) {
            String username = scanner.nextLine();
            names.add(username);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
