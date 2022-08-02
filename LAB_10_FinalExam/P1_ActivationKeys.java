package FUNDAMENTALS.LAB_10_FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class P1_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Generate")) {
            String[] line = inputLine.split(">>>");
            String command = line[0];

            switch (command) {
                case "Contains":
                    String substring = line[1];
                    if (input.contains(substring)) {
                        System.out.printf("%s contains %s\n", input, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String option = line[1];
                    int startIndex = Integer.parseInt(line[2]);
                    int endIndex = Integer.parseInt(line[3]);
                    String toReplace = input.substring(startIndex, endIndex);

                    if (option.equals("Upper")) {
                        input = input.replace(toReplace, toReplace.toUpperCase());
                    } else {
                        input = input.replace(toReplace, toReplace.toLowerCase());
                    }
                    System.out.println(input);
                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(line[1]);
                    int endIndexSlice = Integer.parseInt(line[2]);

                    String toRemove = input.substring(startIndexSlice, endIndexSlice);
                    input = input.replace(toRemove, "");
                    System.out.println(input);
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", input);
    }
}
