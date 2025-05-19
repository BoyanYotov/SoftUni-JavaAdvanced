package StacksAndQueues_01.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci_v02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 1;
        int third = first + second;

        for (int i = 1; i <= n ; i++) {
            first = second;
            second = third;
            third = first + second;
        }

        System.out.println(second);
    }
}
