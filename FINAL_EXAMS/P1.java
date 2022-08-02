package FUNDAMENTALS.FINAL_EXAM_5_12;

import java.util.Locale;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] data = input.split("\\s+");
            String commands = data[0];

            switch (commands){
                case "Translate":
                    String charT = data[1];
                    String replacement = data[2];

                    String toString = builder.toString().replace(charT, replacement);
                    builder = new StringBuilder(toString);
                    System.out.println(builder);
                    break;
                case "Includes":
                    String substringI = data[1];
                    if (builder.toString().contains(substringI)){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String substringS = data[1];
                    String[] split = builder.toString().split(" ");
                    String first = split[0];

                    if (first.equals(substringS)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    builder = new StringBuilder(builder.toString().toLowerCase());
                    System.out.println(builder);
                    break;
                case "FindIndex":
                    String letter = data[1];
                    int lastIndex = builder.toString().lastIndexOf(letter);
                    System.out.println(lastIndex);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);
                    builder.delete(startIndex, count);
                    System.out.println(builder);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
