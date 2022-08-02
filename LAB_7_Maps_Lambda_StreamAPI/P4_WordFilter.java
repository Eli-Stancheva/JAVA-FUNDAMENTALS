package FUNDAMENTALS.LAB_7_Maps_Lambda_StreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class P4_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String element : wordArr) {
            System.out.println(element + " ");
        }
    }
}
