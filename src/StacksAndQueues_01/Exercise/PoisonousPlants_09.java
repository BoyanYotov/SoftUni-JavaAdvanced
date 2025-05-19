package StacksAndQueues_01.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PoisonousPlants_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> plants = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> indices = new ArrayDeque<>();

        boolean plantDies = true;
        int daysCount = 0;

        while (plantDies) {
            plantDies = false;

            for (int i = 1; i <= plants.size() - 1; i++) {
                int currentPlant = plants.get(i);
                if (currentPlant > plants.get(i - 1)) {
                    indices.push(i);
                }
            }

            while (!indices.isEmpty()) {
                int indexToRemove = indices.pop();
                plants.remove(indexToRemove);
                plantDies = true;
            }

            if (!plantDies) {
                break;
            }
            daysCount++;
        }
        System.out.println(daysCount);
    }
}