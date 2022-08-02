package FUNDAMENTALS.MoreExercise_4_Methods;

import java.util.Scanner;

public class P1_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String option = scanner.nextLine();

        switch (option) {
            case "int":
                int numberI = Integer.parseInt(scanner.nextLine());
                System.out.println(integer(numberI));
                break;
            case "real":
                double numberD = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", dou(numberD));
                break;
            case "string":
                String text = scanner.nextLine();
                System.out.println(string(text));
                break;
        }
    }

    public static int integer(int number) {
        return number * 2;
    }

    public static double dou(double number) {
        return number * 1.5;
    }

    public static String string(String text) {
        return "$" + text + "$";
    }
}
