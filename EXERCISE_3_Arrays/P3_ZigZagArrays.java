package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Scanner;

public class P3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[input];
        String[] secondArray = new String[input];

        for (int i = 0; i < input; i++) {
            String numbers = scanner.nextLine();
            String firstNumber = numbers.split(" ")[0];
            String secondNumbers = numbers.split(" ")[1];

            if ((i + 1) % 2 != 0) {
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumbers;
            } else {
                firstArray[i] = secondNumbers;
                secondArray[i] = firstNumber;
            }
        }

        for(String firstLine : firstArray){
            System.out.print(firstLine + " ");
        }

        System.out.println();

        for(String secondLine : secondArray){
            System.out.print(secondLine + " ");
        }
    }
}
