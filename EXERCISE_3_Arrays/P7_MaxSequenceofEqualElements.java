package FUNDAMENTALS.EXERCISE_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P7_MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLen = 0;
        int len = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]){
                len++;
            } else {
                len =  1;
                startIndex = i;
            }
            if (len > maxLen){
                maxLen = len;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxLen; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
