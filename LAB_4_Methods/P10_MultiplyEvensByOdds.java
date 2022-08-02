package FUNDAMENTALS.LAB_4_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    public static int sumOfEven(int n) {
        String intToString = Integer.toString(n);
        int sum = 0;

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int sumOfOdd(int n) {
        String intToString = Integer.toString(n);
        int sum = 0;

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = sumOfEven(n);
        int oddSum = sumOfOdd(n);

        return evenSum * oddSum;
    }
}
