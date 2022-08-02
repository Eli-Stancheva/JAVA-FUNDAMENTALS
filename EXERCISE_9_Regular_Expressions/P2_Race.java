package FUNDAMENTALS.EXERCISE_9_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> map = new LinkedHashMap<>();
        racers.forEach(r -> map.put(r, 0));

        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();

            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                name.append(matcherName.group());
            }

            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }

            String racerName = name.toString();
            if (map.containsKey(racerName)){
                int currDistance = map.get(racerName);
                map.put(racerName, currDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> winners = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + winners.get(0));
        System.out.println("2nd place: " + winners.get(1));
        System.out.println("3rd place: " + winners.get(2));
    }
}
