package FUNDAMENTALS.LAB_4_Methods;

        import java.math.BigDecimal;
        import java.text.DecimalFormat;
        import java.util.Scanner;

public class P8_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double output = mathPower(number, power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(output));
    }

    public static double mathPower(double number, int power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
