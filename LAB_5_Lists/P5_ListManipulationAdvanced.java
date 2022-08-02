package FUNDAMENTALS.LAB_5_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(commandLine.get(1));

                    if (numbersList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondCommand = commandLine.get(1);

                    if (secondCommand.equals("even")) {
                        System.out.println(joinElementsByDelimiter(getEvenNumbers(numbersList), " "));
                    } else {
                        System.out.println(joinElementsByDelimiter(getOddNumbers(numbersList), " "));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum = sum + numbersList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int numberCondition = Integer.parseInt(commandLine.get(2));

                    System.out.println(joinElementsByDelimiter(getConditionalNumbers(numbersList, condition, numberCondition), " "));

                    break;
            }

            input = scanner.nextLine();
        }
    }

    public static List<Integer> getConditionalNumbers(List<Integer> initList, String condition, int number) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < initList.size(); i++) {
            int currentNum = initList.get(i);

            if (condition.equals("<")) {
                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals("<=")) {
                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            }
        }

        return resultList;
    }

    public static List<Integer> getEvenNumbers(List<Integer> initList) {
        List<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            if (initList.get(i) % 2 == 0) {
                evenNums.add(initList.get(i));
            }
        }

        return evenNums;
    }

    public static List<Integer> getOddNumbers(List<Integer> initList) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            if (initList.get(i) % 2 != 0) {
                oddNums.add(initList.get(i));
            }
        }

        return oddNums;
    }

    public static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(item) + delimiter;

            output += numDf;
        }

        return output;
    }
}