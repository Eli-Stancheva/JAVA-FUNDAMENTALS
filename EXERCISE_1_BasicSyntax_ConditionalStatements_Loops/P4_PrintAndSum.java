package FUNDAMENTALS.EXERCISE_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P4_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
