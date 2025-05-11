package SetsAndMaps_03.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> carRegister = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];

            if (direction.equals("IN")) {
                carRegister.add(carNumber);

            } else if (direction.equals("OUT")) {
                carRegister.remove(carNumber);
            }
            input = scanner.nextLine();
        }

        if (carRegister.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carRegister) {
                System.out.println(carNumber);
            }
        }
    }
}
