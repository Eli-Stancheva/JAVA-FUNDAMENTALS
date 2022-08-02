package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(people * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}
