package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (number == 0 ){
            System.out.println(0);
        } else {
            while (number > 0){
                binaryNumber.push(number % 2);
                number /= 2;
            }
        }

        binaryNumber.forEach(System.out::print);
    }
}
