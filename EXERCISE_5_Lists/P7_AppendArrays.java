package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class P7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(list);

        System.out.println(list.toString()                      //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "")              //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "")             //"  7  8, 4 5 6 , 1 2 3 "
                .trim()                                      //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "")        //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"
    }
}
