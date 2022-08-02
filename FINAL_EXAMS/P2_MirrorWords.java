package FUNDAMENTALS.FINAL_EXAM_3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([@]|[#])(?<one>[A-z]{3,})\\1\\1(?<two>[A-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<StringBuilder> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        int count = 0;
        boolean isValid = false;
        boolean isMirror = false;

        while (matcher.find()) {
            count++;
            isValid = true;

            StringBuilder word1 = new StringBuilder(matcher.group("one"));
            StringBuilder word2 = new StringBuilder(matcher.group("two")).reverse();

            if (word1.toString().equals(word2.toString())) {
                word2.reverse();
                builder.append(word1).append(" <=> ").append(word2);
                list.add(builder);
                builder = new StringBuilder();
                isMirror = true;
            }
        }
        if (!isValid) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", count);
        }

        if (!isMirror) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are: ");
            System.out.printf("%s", String.join(", ", list));
        }
    }
}
