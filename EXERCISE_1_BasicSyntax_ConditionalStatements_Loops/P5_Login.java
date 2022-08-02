package FUNDAMENTALS.EXERCISE_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currSymbol = username.charAt(i);
            password += currSymbol;
        }
        String input = scanner.nextLine();
        int countFailed = 0;

        while (!input.equals(password)) {
            countFailed++;
            if (countFailed == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();
        }
        if(input.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
