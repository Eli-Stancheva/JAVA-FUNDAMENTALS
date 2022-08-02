package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.math.BigInteger;
import java.util.Scanner;

public class P5_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());

        System.out.println(first.multiply(second));
    }
}
