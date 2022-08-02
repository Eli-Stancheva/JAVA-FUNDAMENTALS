package FUNDAMENTALS.LAb_2_DataTypes_Variables;

import java.util.Scanner;

public class P11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume = 0;

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
