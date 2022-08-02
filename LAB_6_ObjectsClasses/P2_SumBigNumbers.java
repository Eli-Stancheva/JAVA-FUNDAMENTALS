package FUNDAMENTALS.LAB_6_ObjectsClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P2_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());

        BigInteger result = num1.add(num2);
        System.out.println(result);
    }
}
