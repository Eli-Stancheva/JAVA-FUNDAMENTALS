package FUNDAMENTALS.FINAL_EXAM_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityPop = new HashMap<>();
        Map<String, Integer> cityGold = new HashMap<>();

        String input1 = scanner.nextLine();
        int count = 0;
        while (!input1.equals("Sail")) {
            String[] data = input1.split("\\|\\|");
            String city = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            count++;

            if (!cityGold.containsKey(city)) {
                cityGold.putIfAbsent(city, gold);
            } else {
                int currValue = cityGold.get(city);
                int newValue = currValue + gold;
                cityGold.put(city, newValue);
                count--;
            }

            if (!cityPop.containsKey(city)) {
                cityPop.putIfAbsent(city, population);
            } else {
                int currValue = cityPop.get(city);
                int newValue = currValue + population;
                cityPop.put(city, newValue);
            }

            input1 = scanner.nextLine();
        }

        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            String[] data = input2.split("=>");
            String command = data[0];
            String town = data[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    int currPopulation = cityPop.get(town);
                    int currGold = cityGold.get(town);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);

                    cityPop.put(town, currPopulation - people);
                    cityGold.put(town, currGold - gold);

                    if (cityPop.get(town) == 0 || cityGold.get(town) == 0) {
                        cityPop.remove(town);
                        cityGold.remove(town);
                        count--;
                        System.out.printf("%s has been wiped off the map!\n", town);
                    }
                    break;
                case "Prosper":
                    int goldProsper = Integer.parseInt(data[2]);
                    if (goldProsper < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int increasGold = cityGold.get(town) + goldProsper;
                        cityGold.put(town, increasGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldProsper, town, increasGold);
                    }
                    break;
            }
            input2 = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", count);
        cityGold.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", e.getKey(), cityPop.get(e.getKey()), e.getValue());
                });
    }
}
