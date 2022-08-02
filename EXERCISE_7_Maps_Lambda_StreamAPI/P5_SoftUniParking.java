package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P5_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            String command = inputLine[0];
            String name = inputLine[1];

            switch (command) {
                case "register":
                    String id = inputLine[2];
                    if (map.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", id);
                    } else {
                        map.put(name, id);
                        System.out.printf("%s registered %s successfully\n", name, id);
                    }
                    break;
                case "unregister":
                    if (map.containsKey(name)) {
                        System.out.printf("%s unregistered successfully\n", name);
                        map.remove(name);
                    } else {
                        System.out.printf("ERROR: user %s not found\n", name);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
