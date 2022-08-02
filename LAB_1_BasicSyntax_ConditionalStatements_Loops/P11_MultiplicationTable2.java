package FUNDAMENTALS.LAB_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = Integer.parseInt(scanner.nextLine());

        if (startNumber <= 10){
            for (int i = startNumber; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", number, i, number * i);
            }
        } else {
            System.out.printf("%d X %d = %d\n", number, startNumber, number * startNumber);
        }
    }
}
