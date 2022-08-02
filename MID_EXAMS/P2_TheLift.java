package FUNDAMENTALS.MID_EXAM_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0 && people >= 4) {
                list.set(i, 4);
                people -= 4;
            } else if (list.get(i) <= 1 && people >= 3) {
                list.set(i, list.get(i) + 3);
                people -= 3;
            } else if (list.get(i) <= 2 && people >= 2){
                list.set(i, list.get(i) + 2);
                people -= 2;
            } else if (list.get(i) <= 3 && people >= 1){
                list.set(i, list.get(i) + 1);
                people -= 1;
            } else if (list.get(i) == 4 && people >= 0){
                continue;
            }
        }

        if (people == 0){
            System.out.println("The lift has empty spots!");
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        } else if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
