package FUNDAMENTALS.MID_EXAM_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Urgent":
                    String item = data[1];
                    if (!list.contains(item)) {
                        list.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    String itemR = data[1];
                    list.remove(itemR);
                    break;
                case "Correct":
                    String oldItem = data[1];
                    String newItem = data[2];
                    if (list.contains(oldItem)) {
                        list.set(list.indexOf(oldItem), newItem);
                    }
                    break;
                case "Rearrange":
                    String removeItem = data[1];
                    if (list.contains(removeItem)) {
                    list.remove(removeItem);
                    list.add(removeItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}
