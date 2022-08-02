package FUNDAMENTALS.LAB_4_Methods;

import java.util.Scanner;

public class P6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(area(width, length));
    }

    public static int area(int width, int length) {
        return width * length;
    }
}
