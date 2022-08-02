package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 65 && letter <= 90){
            System.out.println("upper-case");
        } else if (letter >= 97 && letter <= 122){
            System.out.println("lower-case");
        }
    }
}
