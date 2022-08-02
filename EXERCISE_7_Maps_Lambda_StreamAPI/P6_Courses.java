package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P6_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] inputData = input.split(" : ");
            String courseName = inputData[0];
            String studentName = inputData[1];

            if (!map.containsKey(courseName)) {
                map.put(courseName, new ArrayList<>());
            }
            map.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
            map.entrySet().stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                    .forEach(entry -> {
                        System.out.printf("%s: %s\n", entry.getKey(), entry.getValue().size());
                        entry.getValue().stream().sorted().forEach(student -> System.out.printf("-- %s\n", student));
                    });
    }
}
