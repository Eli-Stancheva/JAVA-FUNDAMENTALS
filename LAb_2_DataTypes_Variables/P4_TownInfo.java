package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", city, population, age);
    }
}
