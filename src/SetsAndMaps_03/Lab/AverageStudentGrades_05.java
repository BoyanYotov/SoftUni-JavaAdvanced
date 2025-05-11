package SetsAndMaps_03.Lab;

import java.util.*;

public class AverageStudentGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> register = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String student = input[0];
            double grade = Double.parseDouble(input[1]);

            register.putIfAbsent(student, new ArrayList<>());

            register.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : register.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(a -> System.out.printf("%.2f ",a));
            System.out.printf("(avg: %.2f)\n", calculateAverage(entry.getValue()));
        }
    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
