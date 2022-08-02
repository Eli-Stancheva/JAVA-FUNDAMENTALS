package FUNDAMENTALS.MID_EXAM_2;

import java.util.Scanner;

public class P1_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        double answeredHour = employee1 + employee2 + employee3;
        int count = 0;

        while (students > 0) {
            count++;
            if (count % 4 == 0) {
                continue;
            } else {
                students -= answeredHour;
            }
        }
        System.out.printf("Time needed: %dh.", count);
    }
}
