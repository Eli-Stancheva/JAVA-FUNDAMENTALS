package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P1_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d",((first + second) / third) * fourth);
    }
}
