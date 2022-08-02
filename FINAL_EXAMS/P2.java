package FUNDAMENTALS.FINAL_EXAM_5_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

     //   String regex = "[@#]+(?<clour>[a-z]{3,})[@|#]+(?<sym>[^\\nA-Z0-9]*)(?<count>\\d+)([\\/]+)";
        String regex = "[@#]+(?<clour>[a-z]{3,})[@#]+(?<sym>[^A-Z0-9]*)(?<count>\\d+)([\\/]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String color = matcher.group("clour");
            String count = matcher.group("count");

            System.out.printf("You found %s %s eggs!\n", count, color);
        }
    }
}
