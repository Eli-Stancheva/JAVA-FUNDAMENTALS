package FUNDAMENTALS.LAB_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P2_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!map.containsKey(word)){
                map.put(word, new ArrayList<>());
                map.get(word).add(synonym);
            } else {
                map.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
