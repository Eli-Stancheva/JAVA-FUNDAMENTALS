package FUNDAMENTALS.EXERCISE_10_FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int coolThreshold = 1;
        for (Character symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                coolThreshold *= Integer.parseInt(symbol + "");
            }
        }
        System.out.printf("Cool threshold: %d\n", coolThreshold);

        int countValidEEmojis = 0;
        List<String> coolEmoji = new ArrayList<>();

        while (matcher.find()) {
            countValidEEmojis++;
            int sumLetters = 0;
            for (Character letter : matcher.group().toCharArray()) {
                if (Character.isLetter(letter)) {
                    sumLetters += letter;
                }
            }

            if (sumLetters >= coolThreshold){
                coolEmoji.add(matcher.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:\n", countValidEEmojis);
        coolEmoji.forEach(System.out::println);
    }
}
