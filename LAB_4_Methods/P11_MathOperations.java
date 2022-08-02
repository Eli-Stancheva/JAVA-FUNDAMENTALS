package FUNDAMENTALS.LAB_4_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        char option = scanner.nextLine().charAt(0);
        double num2 = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println(df.format(operations(num1, option, num2)));
    }

    public static double operations(double num1, char option, double num2){
        double result = 0;
        switch (option){
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        return result;
    }
}
