package FUNDAMENTALS.EXERCISE_1_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P9_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightP = Double.parseDouble(scanner.nextLine());
        double robesP = Double.parseDouble(scanner.nextLine());
        double beltsP = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(students + 0.10 * students) * lightP;
        double sumRobes = students * robesP;
        double sumBelt = (students - students / 6)* beltsP;
        double total = sumLight + sumRobes + sumBelt;

        if (total <= budged) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - budged);
        }
    }
}
