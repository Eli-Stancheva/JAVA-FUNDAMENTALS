package FUNDAMENTALS.EXERCISE_4_Methods;

import java.util.Scanner;

public class P6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        middleCharacters(input);

    }

    public static void middleCharacters(String input) {
        if (input.length() % 2 != 0) {
            int indexMiddChar = input.length() / 2;
            System.out.println(input.charAt(indexMiddChar));
        } else {
            int firstMiddIndex = input.length() / 2 - 1;
            int secondMiddIndex = input.length() / 2;
            System.out.println(input.charAt(firstMiddIndex) + "" + input.charAt(secondMiddIndex));
        }

    }
}
