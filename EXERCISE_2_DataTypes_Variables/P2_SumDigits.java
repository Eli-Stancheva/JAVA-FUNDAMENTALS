package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number != 0){
            //намираме последното число
            int lastDigit = number % 10;
            //сумираме цифрите
            sum += lastDigit;
            //премахваме последната цифра от числото
             number /= 10;
        }
        System.out.println(sum);
    }
}
