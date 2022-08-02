package FUNDAMENTALS.EXERCISE_9_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P3_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double allPrice = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            StringBuilder builderName= new StringBuilder();
            StringBuilder builderProduct= new StringBuilder();

            if (matcher.find()){
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;

                builderName.append(matcher.group("name"));
                String text = builderName.toString();

                builderProduct.append(matcher.group("product"));
                String product = builderProduct.toString();

                System.out.printf("%s: %s - %.2f\n", text, product, totalPrice);

                allPrice += totalPrice;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", allPrice);
    }
}
