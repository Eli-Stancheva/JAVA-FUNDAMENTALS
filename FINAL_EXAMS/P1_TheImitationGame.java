package FUNDAMENTALS.FINAL_EXAM_1;

import java.util.Scanner;

public class P1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encrypted = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] data = input.split("[|]");
            String command = data[0];

            switch (command) {
                case "Move":
                    int numLetters = Integer.parseInt(data[1]);
                    String substring = encrypted.substring(0, numLetters);
                    encrypted.delete(0, numLetters);
                    encrypted.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    encrypted.insert(index, value);
                    break;
                case "ChangeAll":
                    String substringChange = data[1];
                    String replacement = data[2];

                    String newEncrypted = encrypted.toString().replace(substringChange, replacement);
                    encrypted = new StringBuilder(newEncrypted);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encrypted);
    }
}
