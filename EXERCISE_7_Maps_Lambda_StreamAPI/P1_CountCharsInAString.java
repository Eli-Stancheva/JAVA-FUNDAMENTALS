package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()){
            if (symbol == ' '){
                continue;
            }
            if (!map.containsKey(symbol)){
                map.put(symbol, 1);
            } else {
                int currSymbol = map.get(symbol);
                map.put(symbol, currSymbol + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
