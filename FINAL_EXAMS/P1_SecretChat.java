package FUNDAMENTALS.FINAL_EXAM_3;

import java.util.Scanner;

public class P1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] data = input.split(":[|]:");
            String command = data[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    builder.insert(index, " ");
                    System.out.println(builder);
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (builder.toString().contains(substring)) {
                        int startIndex = builder.indexOf(substring.toString());
                        int endIndex = startIndex + substring.length();
                        builder.delete(startIndex, endIndex);
                        substring.reverse();
                        builder.append(substring);
                        System.out.println(builder);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringToChange = data[1];
                    String replacement = data[2];
                    String string = builder.toString();
                    string = string.replaceAll(substringToChange, replacement);
                    builder = new StringBuilder(string);
                    System.out.println(builder);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", builder);
    }
}
