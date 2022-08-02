package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Scanner;

public class P2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] firstArr = first.split(" ");
        String[] secondArr = second.split(" ");

        for (String secondElements : secondArr) {
            for (String firstElements : firstArr) {
                if (secondElements.equals(firstElements)) {
                    System.out.print(secondElements + " ");
                }
            }
        }
    }
}
