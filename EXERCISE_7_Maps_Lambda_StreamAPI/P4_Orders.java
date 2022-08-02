package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();
        Map<String, Double> mapPrice = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String[] productData = input.split(" ");
            String name = productData[0];
            double price = Double.parseDouble(productData[1]);
            int quantity = Integer.parseInt(productData[2]);

            mapPrice.put(name, price);

            if (!mapQuantity.containsKey(name)){
                mapQuantity.put(name, quantity);
            } else {
                mapQuantity.put(name, mapQuantity.get(name) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : mapPrice.entrySet()){
            String name = entry.getKey();
            double finalSum = entry.getValue() * mapQuantity.get(name);
            System.out.printf("%s -> %.2f\n", entry.getKey(), finalSum);
        }
    }
}
