package FUNDAMENTALS.LAB_4_Methods;

import java.util.Scanner;

public class P3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            printTriangle(1, i);
        }
        for (int i = number - 1; i >= 0; i--) {
            printTriangle(1, i);
        }
    }

    public static void printTriangle(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
