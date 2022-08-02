package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (player1.size() != 0 && player2.size() != 0) {
            int player1Card = player1.get(0);
            int player2Card = player2.get(0);

            player1.remove(0);
            player2.remove(0);

            if (player1Card > player2Card) {
                player1.add(player1Card);
                player1.add(player2Card);
            } else if (player2Card > player1Card) {
                player2.add(player2Card);
                player2.add(player1Card);
            }
        }
        if (player1.size() == 0){
            System.out.printf("Second player wins! Sum: %d", sum(player2));
        } else if (player2.size() == 0){
            System.out.printf("First player wins! Sum: %d", sum(player1));
        }
    }
    private static int sum(List<Integer> listCard){
        int sum = 0;
        for(int card : listCard){
            sum += card;
        }
        return sum;
    }
}
