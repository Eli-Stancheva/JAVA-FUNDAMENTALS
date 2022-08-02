package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<String> partyList = new ArrayList<>();

        for (int i = 1; i <= commandsCount; i++) {
            String command = scanner.nextLine();
            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = commandParts.get(0);

            if(commandParts.size() == 3){
                if (partyList.contains(name)){
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    partyList.add(name);
                }
            } else if (commandParts.size() == 4){
                if (partyList.contains(name)){
                    partyList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for (String person : partyList){
            System.out.println(person);
        }
    }
}
