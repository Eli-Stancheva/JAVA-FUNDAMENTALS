package FUNDAMENTALS.FINAL_EXAM_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([|]|[#])(?<item>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<cal>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> regexList = new ArrayList<>();

        int sum = 0;
        while (matcher.find()) {
            int fromMatch = Integer.parseInt(matcher.group("cal"));
            sum += fromMatch;
            regexList.add(matcher.group());
        }
        double days = Math.floor(sum / 2000.0);
        System.out.printf("You have food to last you for: %.0f days!\n", days);

        for (String element : regexList){
            String[] data = element.split("[#]|[|]");
            String item = data[1];
            String date = data[2];
            String cal = data[3];
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n", item, date, cal);
        }
    }
}
