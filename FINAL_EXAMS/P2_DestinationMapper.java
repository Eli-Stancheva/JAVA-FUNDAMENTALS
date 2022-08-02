package FUNDAMENTALS.FINAL_EXAM_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();

        String regex = "([=]|[\\/])(?<location>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        List<String> count = new ArrayList<>();
        StringBuilder builderCount = new StringBuilder();
        while (matcher.find()){
            builderCount.append(matcher.group("location"));
            count.add(matcher.group("location"));
        }
        System.out.printf("Destinations: %s\n", String.join(", ", count));
        System.out.printf("Travel Points: %d", builderCount.length());
    }
}
