package FUNDAMENTALS.LAB_4_Methods;

import java.util.Scanner;

public class P4_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String option = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case "add":
                printAdd(num1, num2);
                break;
            case "multiply":
                printMultiply(num1, num2);
                break;
            case "subtract":
                printSubtract(num1, num2);
                break;
            case "divide":
                printDivide(num1, num2);
                break;
        }
    }

    public static void printAdd(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printMultiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void printSubtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void printDivide(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
