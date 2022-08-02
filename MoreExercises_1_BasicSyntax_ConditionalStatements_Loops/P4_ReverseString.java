package FUNDAMENTALS.MoreExercises_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P4_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char currSymbol = word.charAt(i);
            reverse += currSymbol;
        }
        System.out.println(reverse);
    }
}
