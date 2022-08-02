package FUNDAMENTALS.MoreExercises_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P3_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isValid = true;
        double totalSpend = 0;

        while (!input.equals("Game Time")) {
            double priceGame = 0;


            switch (input) {
                case "OutFall 4":
                    priceGame = 39.99;
                    break;
                case "CS: OG":
                    priceGame = 15.99;
                    break;
                case "Zplinter Zell":
                    priceGame = 19.99;
                    break;
                case "Honored 2":
                    priceGame = 59.99;
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    isValid = false;
                    break;
            }
            if (priceGame > balance && isValid) {
                System.out.println("Too Expensive");
            } else if (isValid) {
                balance -= priceGame;
                totalSpend += priceGame;

                if (balance == 0) {
                    System.out.printf("Bought %s\n", input);
                    System.out.println("Out of money!");
                    isValid = false;
                    break;
                } else {
                    System.out.printf("Bought %s\n", input);
                }
            }
            isValid = true;
            input = scanner.nextLine();
        }
        if (isValid){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance);
        }
    }
}
