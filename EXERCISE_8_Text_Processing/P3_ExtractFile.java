package FUNDAMENTALS.EXERCISE_8_Text_Processing;

import java.util.Scanner;

public class P3_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");
        String file = inputArr[inputArr.length - 1];
        String[] fileNameExtension = file.split("\\.");
        String fileName = fileNameExtension[0];
        String fileExtension = fileNameExtension[1];

        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", fileExtension);
    }
}
