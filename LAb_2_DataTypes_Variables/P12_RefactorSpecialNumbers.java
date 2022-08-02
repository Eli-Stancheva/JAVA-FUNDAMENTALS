package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int curr = 0;
        boolean isSpecialNum = false;

        for (int i = 1; i <= number; i++) {
            curr = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
           if(isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11)){
               System.out.printf("%d -> True\n", curr);
           } else {
               System.out.printf("%d -> False\n", curr);
           }
            sum = 0;
            i = curr;
        }
    }
}
