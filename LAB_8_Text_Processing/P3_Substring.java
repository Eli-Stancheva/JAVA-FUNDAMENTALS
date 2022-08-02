package FUNDAMENTALS.LAB_8_Text_Processing;

import java.util.Scanner;

public class P3_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(toRemove);

        while (index != -1){
            text = text.replace(toRemove, "");
            index = text.indexOf(toRemove);
        }
        System.out.println(text);
    }
}
