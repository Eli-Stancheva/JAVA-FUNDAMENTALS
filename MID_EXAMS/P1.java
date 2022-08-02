package FUNDAMENTALS.MID_RETAKE_EXAM;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideSize = Double.parseDouble(scanner.nextLine());
        int sheetsPaper = Integer.parseInt(scanner.nextLine());

        double area = sideSize * sideSize * 6;
        double everySheet = 0;
        double sum = 0;
        for (int i = 1; i <= sheetsPaper; i++) {
            double lenSheet = Double.parseDouble(scanner.nextLine());
            double widthSheet = Double.parseDouble(scanner.nextLine());

            everySheet = lenSheet * widthSheet;

            if (i == 3) {
                everySheet = everySheet * 0.75;
            }

            if (i == 5) {
                continue;
            }
            sum += everySheet;
        }

        double total = (sum / area) * 100;
        double left = 100 - total;

       if (total < 100){
           System.out.println("You are out of paper!");
           System.out.printf("%.2f%% of the box is not covered.", left);
       } else {
           System.out.println("You've covered the gift box!");
           System.out.printf("%.2f%% wrap paper left.", ((sum - area) / sum) * 100);
       }
    }
}
