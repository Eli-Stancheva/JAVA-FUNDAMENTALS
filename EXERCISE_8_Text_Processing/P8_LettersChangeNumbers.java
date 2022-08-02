package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P8_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String element : input){
            double modified = getModifiedNumber(element);
            totalSum += modified;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String element) {
        char first = element.charAt(0);
        char second = element.charAt(element.length() - 1);

        StringBuilder builder = new StringBuilder(element);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());

        if (Character.isUpperCase(first)){
            int position = (int)first - 64;
            number /= position;
        } else {
            int position = (int)first - 96;
            number *= position;
        }

        if (Character.isUpperCase(second)){
            int position = (int)second - 64;
            number -= position;
        } else {
            int position = (int)second - 96;
            number += position;
        }

        return number;
    }
}
