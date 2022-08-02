package FUNDAMENTALS.MoreExercises_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P1_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int average = 0;
        int min = 0;

        if (first > second && first > third) {
            max = first;
        } else if (second > first && second > third) {
            max = second;
        } else if (third > first && third > second) {
            max = third;
        }

        if ((first < second && first > third) || (first > second && first < third)) {
            average = first;
        } else if ((second < first && second > third) || (second > first && second < third)) {
            average = second;
        } else if ((third < first && third > second) || (third > first && third < second)) {
            average = third;
        }

        if (first < second && first < third) {
            min = first;
        } else if (second < first && second < third) {
            min = second;
        } else if (third < first && third < second) {
            min = third;
        }

        System.out.println(max);
        System.out.println(average);
        System.out.println(min);
    }
}
