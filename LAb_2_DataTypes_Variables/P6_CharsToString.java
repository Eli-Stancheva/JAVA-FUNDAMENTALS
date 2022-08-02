package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P6_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", first, second, third);
    }
}
