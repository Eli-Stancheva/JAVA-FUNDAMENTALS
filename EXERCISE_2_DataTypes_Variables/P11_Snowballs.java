package FUNDAMENTALS.EXERCISE_2_DataTypes_Variables;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSnowballs = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int snowballSnowHighest = 0;
        int snowballTimeHighest = 0;
        int snowballQualityHighest = 0;

        for (int i = 0; i < countSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime  = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime,snowballQuality);

            if (snowballValue > maxValue){
                maxValue = snowballValue;
                snowballSnowHighest = snowballSnow;
                snowballTimeHighest = snowballTime;
                snowballQualityHighest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowHighest,snowballTimeHighest,maxValue, snowballQualityHighest);
    }
}
