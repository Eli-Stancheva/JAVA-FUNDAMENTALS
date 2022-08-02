package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currLines = 0;
        for (int i = 1; i <= lines; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            currLines += quantities;
            if(currLines > capacity){
                System.out.println("Insufficient capacity!");
                currLines -= quantities;
            }
        }
        System.out.println(currLines);
    }
}
