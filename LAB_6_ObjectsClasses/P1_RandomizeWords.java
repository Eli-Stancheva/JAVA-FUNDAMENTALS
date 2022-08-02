package FUNDAMENTALS.LAB_6_ObjectsClasses;

import java.util.Random;
import java.util.Scanner;

public class P1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split("\\s+");

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = random.nextInt(arr.length);
            int y = random.nextInt(arr.length);

            String oldWord = arr[x];
            arr[x] = arr[y];
            arr[y] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), arr));
    }
}
