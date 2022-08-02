package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P8_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new TreeMap<>();

        while (!input.equals("End")) {
            String[] inputData = input.split(" -> ");
            String companyName = inputData[0];
            String employeeId = inputData[1];

            if (map.containsKey(companyName)) {
                List<String> employees = map.get(companyName);
                if (!employees.contains(employeeId)) {
                    employees.add(employeeId);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                map.put(companyName, employees);
            }
            input = scanner.nextLine();
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
