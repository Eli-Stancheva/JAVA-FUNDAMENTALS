package FUNDAMENTALS.EXERCISE_10_FinalExam;

import java.util.Scanner;

public class P1_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        //"Add Stop:{index}:{string}".split(":") ->["Add Stop", "{index}", "{string}"]
        //"Remove Stop:{start_index}:{end_index}".split(":") -> ["Remove Stop", "{start index}", "{end_index}"]
        //"Switch:{old_string}:{new_string}".split(":") ->["Switch", "{old_string}", "{new_string}"]
        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0]; // "Add Stop", "Remove Stop", "Switch"
            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stopName = commandParts[2];
                    //проверка дали индекса ми е валиден -> дали индекса е вътре в текста
                    if (isValidIndex(index, stops)) {
                        //разделяме текста на две части: до индекса и след индекса
                        //първа част + stopName + втора част

                        //"Hawai::Cyprys-Greece"
                        String firstHalf = stops.substring(0, index); //"Hawai::"
                        String secondHalf = stops.substring(index); //"Cyprys-Greece"
                        stops = new StringBuilder(firstHalf + stopName + secondHalf);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        //първа част: 0 дo startIndex
                        //втората част: endIndex до края
                        //"Hawai::RomeCyprys-Greece"
                        // String firstPart = stops.substring(0, startIndex);
                        //String secondPart = stops.substring(endIndex + 1);
                        stops.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldStop = commandParts[1];
                    String newStop = commandParts[2];
                    if (stops.toString().contains(oldStop)) {
                        stops = new StringBuilder(stops.toString().replace(oldStop, newStop));
                    }
                    break;
            }

            System.out.println(stops);
            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);

    }

    public static boolean isValidIndex(int index, StringBuilder stops) {
        //true -> валиден
        //false -> невалиден
        return index >= 0 && index < stops.toString().length();
    }
}
