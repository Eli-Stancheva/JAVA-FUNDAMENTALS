package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P1_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String element : input){
            if (isValid(element)){
                System.out.println(element);
            }
        }
    }
    public static boolean isValid(String username){
        int lenSymbol = username.length();

        if (lenSymbol < 3 || lenSymbol > 16){
            return false;
        }
        for (char symbol : username.toCharArray()){
            if (!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))){
                return false;
            }
        }
        return true;
    }
}
