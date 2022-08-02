package FUNDAMENTALS.MID_EXAM_2;

import java.util.*;
import java.util.stream.Collectors;

public class P3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = sum * 1.0 / list.size();

        List<Integer> topInt = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > avg) {
                topInt.add(list.get(i));
            }
        }
        Collections.sort(topInt);
        Collections.reverse(topInt);


        if (topInt.size() > 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(topInt.get(i) + " ");
            }
        } else if (topInt.size() == 0){
            System.out.println("No");
        } else {
            System.out.println(topInt.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
