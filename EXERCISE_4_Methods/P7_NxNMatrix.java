package FUNDAMENTALS.EXERCISE_4_Methods;

import java.util.Scanner;

public class P7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            matrix(num);
        }
    }

    public static void matrix(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
