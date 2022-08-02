package FUNDAMENTALS.LAB_5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            List<String> commandList = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = commandList.get(0);

            switch (command){
                case "Add":
                    int numAdd = Integer.parseInt(commandList.get(1));
                    numberList.add(numAdd);
                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(commandList.get(1));
                    numberList.remove(Integer.valueOf(numRemove));
                    break;
                case "RemoveAt":
                    int numRemoveAt = Integer.parseInt(commandList.get(1));
                    numberList.remove(numRemoveAt);
                    break;
                case "Insert":
                    int numInsert = Integer.parseInt(commandList.get(1));
                    int numIndex = Integer.parseInt(commandList.get(2));
                    numberList.add(numIndex, numInsert);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
