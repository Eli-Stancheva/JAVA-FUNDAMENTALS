package FUNDAMENTALS.FINAL_EXAM_5_12;

import java.util.*;
import java.util.stream.Collectors;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();

        String text = scanner.nextLine();
        String[] data = text.split(" [|] ");

        for (int i = 0; i < data.length; i++) {
            String[] wordDef = data[i].split(": ");
            String word = wordDef[0];
            String definition = wordDef[1];

            if (map.containsKey(word)) {
                map.get(word).add(definition);
            } else {
                map.put(word, new ArrayList<>());
                map.get(word).add(definition);
            }
        }

        List<String> test = new ArrayList<>();
        String[] teacher = scanner.nextLine().split(" [|] ");
        for (int i = 0; i < teacher.length; i++) {
            String word = teacher[i];
            test.add(word);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "Test":
                for (String element : test){
                    if (map.containsKey(element)){
                        List<String> value = map.get(element);
                        Collections.sort(value);
                        System.out.printf("%s:\n", element);
                        for (String e : value){
                            System.out.printf(" -%s\n", e);
                        }
                    }
                }
                break;
            case "Hand Over":
                    map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                            .forEach(e -> System.out.printf("%s ", e.getKey()));
                break;
        }
    }

}
