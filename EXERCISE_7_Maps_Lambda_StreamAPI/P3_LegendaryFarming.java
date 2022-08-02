package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P3_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialsMap = new TreeMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        Map<String, Integer> junkMap = new TreeMap<>();

        boolean isOver = false;
        while (!isOver) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currQuantity = materialsMap.get(material);
                    materialsMap.put(material, currQuantity + quantity);

                    if (materialsMap.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }

                        int points = materialsMap.get(material) - 250;
                        materialsMap.put(material, points);
                        isOver = true;
                        break;
                    }
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currJunkQua = junkMap.get(material);
                        junkMap.put(material, currJunkQua + quantity);
                    }
                }
            }
        }
        materialsMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));

        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}
