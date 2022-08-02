package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //"1 4 3 2".split(" ") -> ["1", "4", "3", "2"].map -> [1, 4, 3, 2]

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currNumber = numbers[i];

            if (i == numbers.length - 1){
                System.out.print(currNumber + " ");
                break;
            }
            
            boolean isTop = false;

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextNumber = numbers[j];
                if (currNumber > nextNumber){
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currNumber + " ");
            }
        }
    }
}
