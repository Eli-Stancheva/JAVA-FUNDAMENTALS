package FUNDAMENTALS.LAB_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P4_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = hours * 60 + minutes;
        int timeAfter = totalMin + 30;
        int finalHour = timeAfter / 60;
        int finalMin = timeAfter % 60;

        if(finalHour >= 24){
            finalHour = 0;
        }

        System.out.printf("%d:%02d",finalHour,finalMin);
    }
}
