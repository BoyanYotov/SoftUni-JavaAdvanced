package SetsAndMaps_03.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        while (!input.equals("PARTY")) {
            char firstSymbol = input.charAt(0);

            if (Character.isDigit(firstSymbol)) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }

            input = scanner.nextLine();
        }

        String visitors = scanner.nextLine();

        while (!visitors.equals("END")) {
            vipGuests.remove(visitors);
            regularGuests.remove(visitors);

            visitors = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());
        for (String vipGuest : vipGuests) {
            System.out.println(vipGuest);
        }
        for (String regularGuest : regularGuests) {
            System.out.println(regularGuest);
        }
    }
}
