package FUNDAMENTALS.EXERCISE_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayWeek = scanner.nextLine();

        double price = 0;

        switch (typeGroup) {
            case "Students":
                if (dayWeek.equals("Friday")) {
                    price = countGroup * 8.45;
                } else if (dayWeek.equals("Saturday")) {
                    price = countGroup * 9.80;
                } else if (dayWeek.equals("Sunday")) {
                    price = countGroup * 10.46;
                }

                if (countGroup >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (dayWeek.equals("Friday")) {
                    price = countGroup * 10.90;

                    if(countGroup >= 100){
                        double free = 10 * 10.90;
                        price = price - free;
                    }
                } else if (dayWeek.equals("Saturday")) {
                    price = countGroup * 15.60;

                    if(countGroup >= 100){
                        double free = 10 * 15.60;
                        price = price - free;
                    }
                } else if (dayWeek.equals("Sunday")) {
                    price = countGroup * 16;

                    if(countGroup >= 100){
                        double free = 10 * 16;
                        price = price - free;
                    }
                }
                break;
            case "Regular":
                if (dayWeek.equals("Friday")) {
                    price = countGroup * 15;
                } else if (dayWeek.equals("Saturday")) {
                    price = countGroup * 20;
                } else if (dayWeek.equals("Sunday")) {
                    price = countGroup * 22.50;
                }

                if (countGroup >= 10 && countGroup <= 20) {
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
