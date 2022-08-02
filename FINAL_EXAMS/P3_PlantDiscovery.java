package FUNDAMENTALS.FINAL_EXAM_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mapRarity = new LinkedHashMap<>();
        Map<String, Double> mapRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantsInfo = scanner.nextLine().split("<->");
            String plant = plantsInfo[0];
            int rarity = Integer.parseInt(plantsInfo[1]);

            mapRarity.putIfAbsent(plant, 0);
            mapRating.putIfAbsent(plant, 0.0);

            mapRarity.put(plant, rarity);
        }

        String line = scanner.nextLine();
        while (!line.equals("Exhibition")) {
            String[] tokens = line.split("[: -]+");       //Rate: Woodii - 10
            String command = tokens[0];
            String plant = tokens[1];

            if (!mapRating.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(tokens[2]);
                        if (mapRating.get(plant) == 0) {
                            mapRating.put(plant, rating);
                        } else {
                            double newRating = (mapRating.get(plant) + rating) / 2;
                            mapRating.put(plant, newRating);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(tokens[2]);
                        mapRarity.put(plant, rarity);
                        break;
                    case "Reset":
                        mapRating.replace(plant, 0.0);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            line = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        mapRarity.entrySet().stream().sorted((e1, e2) -> {
            int result = e2.getValue() - e1.getValue();
            if (result == 0) {
                double res = (mapRating.get(e2.getKey()) - mapRating.get(e1.getKey()));
                return (int) res;
            }
            return result;
        }).forEach(entry -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), entry.getValue(), mapRating.get(entry.getKey()));
        });
    }
}
