package FUNDAMENTALS.LAB_3_Arrays;

import java.util.Scanner;

public class P1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (day >= 1 && day <= 7) {
            System.out.println(weekday[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

