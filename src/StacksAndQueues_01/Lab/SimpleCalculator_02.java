package StacksAndQueues_01.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque <String> calculator = new ArrayDeque<>();

        Collections.addAll(calculator,input);

        int result = 0;

        while (calculator.size() > 1){
            int firstNumber = Integer.parseInt(calculator.pop());
            char operator = calculator.pop().charAt(0);
            int secondNumber = Integer.parseInt(calculator.pop());

            if (operator == '+'){
                result = firstNumber + secondNumber;
            } else if (operator == '-'){
                result = firstNumber - secondNumber;
            }
            calculator.push(String.valueOf(result));
        }

        System.out.println(calculator.pop());

    }
}
