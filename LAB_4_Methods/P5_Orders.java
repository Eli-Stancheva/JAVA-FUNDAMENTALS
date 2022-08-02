package FUNDAMENTALS.LAB_4_Methods;

import java.util.Scanner;

public class P5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String option = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        print(option, quantity);
    }

    public static void print(String option, double quantity) {
        switch (option) {
            case "coffee":
                System.out.printf("%.2f", quantity * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", quantity);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * 2.00);
                break;
        }
    }
}
