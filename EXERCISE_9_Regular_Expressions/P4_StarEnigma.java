package FUNDAMENTALS.EXERCISE_9_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessage = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<name>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldier>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int countAttacked = 0;
        int countDestroyed = 0;

        List<String> attackList = new ArrayList<>();
        List<String> destroyedList = new ArrayList<>();

        for (int i = 1; i <= countMessage; i++) {
            String encrypted = scanner.nextLine();
            String decrypted = getDecryptedMessage(encrypted);

            Matcher matcher = pattern.matcher(decrypted);

            if (matcher.find()) {
                String attack = matcher.group("attack");
                if (attack.equals("A")) {
                    countAttacked++;
                    attackList.add(matcher.group("name"));
                } else if (attack.equals("D")) {
                    countDestroyed++;
                    destroyedList.add(matcher.group("name"));
                }
            }
        }
        System.out.printf("Attacked planets: %d\n", countAttacked);
        Collections.sort(attackList);
        attackList.forEach(planet -> System.out.printf("-> %s\n", planet));

        System.out.printf("Destroyed planets: %d\n", countDestroyed);
        Collections.sort(destroyedList);
        destroyedList.forEach(planet -> System.out.printf("-> %s\n", planet));
    }

    private static String getDecryptedMessage(String encrypted) {
        int countLetters = getCountLetters(encrypted);  //3

        StringBuilder letter = new StringBuilder();
        for (char symbol : encrypted.toCharArray()) {
            symbol -= countLetters;
            letter.append(symbol);
        }
        return letter.toString();
    }

    private static int getCountLetters(String encrypted) {
        int counter = 0;
        for (char symbol : encrypted.toLowerCase().toCharArray()) {
            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                counter++;
            }
        }
        return counter;
    }
}
