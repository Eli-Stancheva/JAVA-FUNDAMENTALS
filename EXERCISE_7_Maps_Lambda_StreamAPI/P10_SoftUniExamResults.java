package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> result = new LinkedHashMap<>();
        Map<String, Integer> submission = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputData = input.split("-");
            String name = inputData[0];
            String language = inputData[1];

            if (language.equals("banned")) {
                result.remove(name);
            } else {
                int points = Integer.parseInt(inputData[2]);
                result.putIfAbsent(name, points);
                int currPoint = result.get(name);
                if (points > currPoint){
                    result.put(name, points);
                }
            }

            if (!submission.containsKey(language)) {
                submission.put(language, 1);
            } else {
                submission.put(language, submission.get(language) + 1);
            }

            if (submission.containsKey("banned")) {
                submission.remove(language);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        submission.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
