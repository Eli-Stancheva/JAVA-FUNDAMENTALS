package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("end")){
            String[] commandName = commands.split(" ");

            if (commandName[0].equals("Add")){
                int passengers = Integer.parseInt(commandName[1]);
                wagons.add(passengers);
            } else {
                int addPassengers = Integer.parseInt(commandName[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currWagon = wagons.get(i);
                    if(currWagon + addPassengers <= max){
                        wagons.set(i, currWagon + addPassengers);
                        break;
                    }
                }
            }
            commands = scanner.nextLine();
        }
        for(int output : wagons){
            System.out.print(output + " ");
        }
    }
}
