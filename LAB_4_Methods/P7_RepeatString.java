package FUNDAMENTALS.LAB_4_Methods;

import java.util.Scanner;

public class P7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(str, number));
    }

    public static String repeatString(String str, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += str;
        }
        return result;
    }
}
