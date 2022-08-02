package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P2_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        int max = Math.max(first.length(), second.length());
        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i < first.length() && i < second.length()) {
                sum += first.charAt(i) * second.charAt(i);
            } else if (i < first.length()){
                sum += first.charAt(i);
            } else {
                sum += second.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
