package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P4_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];

            switch (commandName) {
                case "Add":
                    int number = Integer.parseInt(commandData[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);

                    if (isValidIndex(index, numbers.size())) {
                        numbers.add(index, numberInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(commandData[1]);
                    if (isValidIndex(indexRemove, numbers.size())) {
                        numbers.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String commandShift = commandData[1];
                    int count = Integer.parseInt(commandData[2]);
                    if (commandShift.equals("left")) {
                        left(numbers, count);
                    } else if (commandShift.equals("right")) {
                        right(numbers, count);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int element : numbers){
            System.out.print(element + " ");
        }
    }

    public static void left(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstElement = numbers.get(0);
            numbers.add(firstElement);
            numbers.remove(0);
        }
    }

    public static void right(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);
        }
    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
