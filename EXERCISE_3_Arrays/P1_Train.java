package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Scanner;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countWagons];

        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[i] = countPeople;
            sum += wagons[i];
        }

        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i] + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
