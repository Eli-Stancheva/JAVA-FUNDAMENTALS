package FUNDAMENTALS.MID_EXAM_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        int index = 0;
        int previousIndex = 0;

        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            previousIndex = index;
            index = Integer.parseInt(commandList.get(1));

            if (index + previousIndex >= numberList.size()) {
                if (numberList.get(0) == 0) {
                    System.out.println("Place 0 already had Valentine's day.");
                } else {
                    numberList.set(0, numberList.get(0) - 2);
                    if (numberList.get(0) <= 0) {
                        System.out.println("Place 0 has Valentine's day.");
                    }
                }

                index = 0;
            } else {
                if (numberList.get(index + previousIndex) == 0) {
                    System.out.printf("Place %d already had Valentine's day.", index + previousIndex);
                } else {
                    numberList.set(index + previousIndex, numberList.get(index + previousIndex) - 2);
                    if (numberList.get(index + previousIndex) == 0) {
                        System.out.printf("Place %d has Valentine's day.\n", index + previousIndex);
                    }
                }
            }

            command = scanner.nextLine();
        }
        int failedCount = 0;
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) != 0) {
                failedCount++;
            }
        }
        System.out.printf("Cupid's last position was %d.\n", index + previousIndex);
        if (failedCount == numberList.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedCount);
        }
    }
}

