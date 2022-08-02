package FUNDAMENTALS.EXERCISE_4_Methods;

import java.util.Scanner;

public class P2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(vowelsCount(word));
    }

    public static int vowelsCount(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A'     ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'i' ||word.charAt(i) == 'I'  ||
                    word.charAt(i) == 'o' ||word.charAt(i) == 'O'  ||
                    word.charAt(i) == 'u' ||word.charAt(i) == 'U'  ){

                count++;
            }
        }
        return count;
    }
}
