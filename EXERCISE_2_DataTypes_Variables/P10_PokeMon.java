package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int firstTimePower = power;
        while (power >= distance){
            power -= distance;
            count++;

            if (power == firstTimePower * 0.5){
                if (exhaustionFactor > 0){
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
