package FUNDAMENTALS.MoreExercise_7_Maps_Lambda_StreamAPI;

import java.util.Scanner;

public class P2_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("no more time")){
            String[] inputData = input.split(" -> ");
            String username = inputData[0];
            String contest = inputData[1];
            int point = Integer.parseInt(inputData[2]);


            input = scanner.nextLine();
        }
    }
}
