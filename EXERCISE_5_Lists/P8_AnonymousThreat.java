package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P8_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            String[] commandData = input.split("\\s+");
            String command = commandData[0];

            if (command.equals("merge")){
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }

                if (endIndex > names.size() - 1){
                    endIndex = names.size() - 1;
                }

                boolean isStartIndexValid = isValid(startIndex,names.size());
                boolean isEndIndexValid = isValid(endIndex,names.size());

                if (isStartIndexValid && isEndIndexValid){
                    StringBuilder merge = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        merge.append(names.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, merge.toString());
                }
            } else if (command.equals("divide")){
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);

                String elementForDivide = names.get(index);
                names.remove(index);

                int partSize = elementForDivide.length() / partitions;
                int begin = 0;

                for (int i = 1; i < partitions; i++) {
                    names.add(index, elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }
                names.add(index, elementForDivide.substring(begin));
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", names));
    }
    public static boolean isValid (int index, int size){
        return index >= 0 && index <= size - 1;
    }
}
