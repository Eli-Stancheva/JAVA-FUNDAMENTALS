package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= array.length - 1; i++) {
            int number = array[i];
            for (int j = i + 1; j <= array.length - 1; j++) {
                int number2 = array[j];
                if (number + number2 == sum){
                    System.out.printf("%d %d\n", number, number2);
                }
            }
        }
    }
}
