package FUNDAMENTALS.LAB_8_Text_Processing;

import java.util.Scanner;

public class P5_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letter.append(symbol);
            } else {
                character.append(symbol);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(character);
    }
}
