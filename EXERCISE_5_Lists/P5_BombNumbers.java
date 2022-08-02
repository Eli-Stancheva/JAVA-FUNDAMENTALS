package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] data = scanner.nextLine().split("\\s+");

        String bombNum = data[0];
        int power = Integer.parseInt(data[1]);

        while (list.contains(bombNum)){
            int elementIndex = list.indexOf(bombNum);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, list.size() - 1);

            for (int i = right; i >= left; i--) {
                list.remove(i);
            }
        }
        System.out.println(list.stream().mapToInt(Integer::parseInt).sum());
    }
}
