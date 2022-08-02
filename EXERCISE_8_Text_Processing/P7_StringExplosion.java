package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P7_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int strength = 0;

        for (int i = 0; i < text.length(); i++) {
            char currSymbol = text.charAt(i);

            if (currSymbol == '>'){
                strength += Integer.parseInt("" + text.charAt(i + 1));
            } else if (strength > 0){
                text.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(text);
    }
}
