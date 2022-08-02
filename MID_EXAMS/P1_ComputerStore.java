package FUNDAMENTALS.MID_EXAM_1;

import java.util.Scanner;

public class P1_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);

            if (price < 0){
                System.out.println("Invalid price!");
            } else {
                sum += price;
            }
            input = scanner.nextLine();
        }
        double tax = sum * 0.20;
        double total = sum + tax;

        if (total <= 0){
            System.out.println("Invalid order!");
        } else if (input.equals("special")) {
            total = total * 0.90;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", sum);
            System.out.printf("Taxes: %.2f$\n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", sum);
            System.out.printf("Taxes: %.2f$\n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
