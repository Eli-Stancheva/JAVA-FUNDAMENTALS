package FUNDAMENTALS.EXERCISE_5_Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            List<String> commandList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandList.get(0);

            switch (command){
                case "Delete":
                    int number = Integer.parseInt(commandList.get(1));
                    numberList.removeAll(Arrays.asList(number));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandList.get(1));
                    int position = Integer.parseInt(commandList.get(2));
                    numberList.add(position, element);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
