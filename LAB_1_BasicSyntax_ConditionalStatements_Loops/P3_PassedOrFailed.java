package FUNDAMENTALS.LAB_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P3_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 3){
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
