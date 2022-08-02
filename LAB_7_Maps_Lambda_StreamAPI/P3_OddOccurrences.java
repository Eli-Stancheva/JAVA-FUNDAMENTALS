package FUNDAMENTALS.LAB_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P3_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : arr){
            String lowerCaseWord = word.toLowerCase();

            if (map.containsKey(lowerCaseWord)){
                int currCount = map.get(lowerCaseWord);
                map.put(lowerCaseWord, currCount + 1);
            } else {
                map.put(lowerCaseWord, 1);
            }
        }
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if (count % 2 != 0){
                list.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", list));
    }
}
