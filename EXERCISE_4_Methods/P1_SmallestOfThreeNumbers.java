package FUNDAMENTALS.EXERCISE_4_Methods;

import java.util.Scanner;

public class P1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(printSmallest(first, second, third));
    }

    public static int printSmallest(int first, int second, int third) {
        int min;
        if (first <= second && first <= third) {
            min = first;
        } else if (second <= first && second <= third) {
            min = second;
        } else {
            min = third;
        }
        return min;
    }
}
