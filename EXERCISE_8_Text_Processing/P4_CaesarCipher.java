package FUNDAMENTALS.EXERCISE_8_Text_Processing;

        import java.util.Scanner;

public class P4_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();
        for (char symbol : input.toCharArray()){
            char newSymbol = (char)(symbol + 3);
            encrypted.append(newSymbol);
        }
        System.out.println(encrypted);
    }
}
