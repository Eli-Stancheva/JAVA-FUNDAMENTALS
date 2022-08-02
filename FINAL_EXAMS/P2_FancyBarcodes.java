package FUNDAMENTALS.FINAL_EXAM_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z]+[A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        boolean isDigit = false;

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();

            matcher = pattern.matcher(barcode);

            StringBuilder group = new StringBuilder();
            if (matcher.find()) {
                String valid = matcher.group();
                for (char symbol : valid.toCharArray()) {
                    if (symbol >= 48 && symbol <= 57) {
                        group.append(symbol);
                        isDigit = true;
                    }
                }
                if (isDigit) {
                    System.out.printf("Product group: %s\n", group);
                    isDigit = false;
                } else {
                    System.out.println("Product group: 00");
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
