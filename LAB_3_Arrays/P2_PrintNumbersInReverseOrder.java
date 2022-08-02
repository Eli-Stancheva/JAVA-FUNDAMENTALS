package FUNDAMENTALS.LAB_3_Arrays;

import java.util.Scanner;

public class P2_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[num];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}
