package FUNDAMENTALS.EXERCISE_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double priseH = Double.parseDouble(scanner.nextLine());
        double priseM = Double.parseDouble(scanner.nextLine());
        double priseK = Double.parseDouble(scanner.nextLine());
        double priseD = Double.parseDouble(scanner.nextLine());

        int countH = lostGames / 2;
        int countM = lostGames / 3;
        int countK = lostGames / 6;
        int countD = lostGames / 12;

        double price = (countH * priseH) + (countM * priseM) + (countK * priseK) + (countD * priseD);
        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}
