package DefiningClasses_06.CarInfo_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Car automobile = new Car();

        for (int i = 1; i <= n ; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);

            automobile.setBrand(brand);
            automobile.setModel(model);
            automobile.setHorsePower(horsePower);

            System.out.println(automobile.carInfo());
        }
    }
}
