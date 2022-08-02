package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P6_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        if (input == null && input.length() == 0){
            return;
        }
        char previous = input.charAt(0);
        output.append(previous);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != previous){
                output.append(ch);
                previous = ch;
            }
        }
        System.out.println(output);
    }
}
