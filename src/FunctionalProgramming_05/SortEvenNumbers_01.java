package FunctionalProgramming_05;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toList();
//        List<Integer> evenNumbers = new ArrayList<>();
//
//        for (Integer number : numbers) {
//            if (number %2 ==0){
//                evenNumbers.add(number);
//            }
//        }
//
//        for (Integer evenNumber : evenNumbers) {
//            System.out.print(evenNumber + ", ");
//        }
//
//        System.out.println();
//
//        Collections.sort(evenNumbers);
//        for (Integer evenNumber : evenNumbers) {
//            System.out.print(evenNumber + ", ");
//        }


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println(numbers.toString().replace("[","").replace("]",""));

        Collections.sort(numbers);

        System.out.println(numbers.toString().replace("[","").replace("]",""));

    }
}
