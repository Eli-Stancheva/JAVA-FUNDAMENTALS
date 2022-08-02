package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P7_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, new ArrayList<>());
            }
            studentsGrades.get(name).add(grade);
        }

        Map<String, Double> gradesOverFour = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            String names = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = average(grades);

            if (average >= 4.50) {
                gradesOverFour.put(names, average);
            }
        }

        gradesOverFour.entrySet()
                .stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()));
    }

    public static double average(List<Double> grade) {
        double sum = 0;
        for (double garde : grade) {
            sum = sum + garde;
        }
        return sum / grade.size();
    }
}
