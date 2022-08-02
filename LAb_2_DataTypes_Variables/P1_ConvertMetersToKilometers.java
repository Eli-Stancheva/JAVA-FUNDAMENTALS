package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P1_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = meters * 0.001;
        System.out.printf("%.2f", kilometers);
    }
}
