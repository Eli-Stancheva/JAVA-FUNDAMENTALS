package FUNDAMENTALS.EXERCISE_7_Maps_Lambda_StreamAPI;

import java.util.*;

public class P9_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] inputDatta = input.split("\\s+\\|\\s+");
                String side = inputDatta[0];
                String user = inputDatta[1];

                map.putIfAbsent(side, new ArrayList<>());

                boolean itExist = false;
                for (List<String> list : map.values()) {
                    if (list.contains(user)) {
                        itExist = true;
                    }
                }
                if (!itExist) {
                    map.get(side).add(user);
                }
            } else if (input.contains("->")) {
                String[] inputDatta = input.split("\\s+->\\s+");
                String user = inputDatta[0];
                String side = inputDatta[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));
                map.putIfAbsent(side, new ArrayList<>());
                map.get(side).add(user);
                System.out.printf("%s joins the %s side!\n", user, side);
            }
            input = scanner.nextLine();
        }
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    //1. по големина на броя на хората -> descending order
                    int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    //1 -> втория размер > първия размер -> разменя
                    //0 -> размерите на двата списъка са еднакви
                    //-1 -> втория размер < първия размет -> не ги разменя
                    if (sortedResult == 0) {
                        //броят на хората в двете страни е еднакъв -> сортирам по име на страната
                        sortedResult = e1.getKey().compareTo(e2.getKey());
                        //е1 < е2 -> -1
                        //е1 == е2 -> 0
                        //е1 > е2 -> 1
                    }
                    return sortedResult;
                }).forEach(entry -> {
            //Side: {forceSide}, Members: {forceUsers.Count}
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
        });
    }
}
