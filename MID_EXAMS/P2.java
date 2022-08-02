package FUNDAMENTALS.MID_RETAKE_EXAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" [|] ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Stop!")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Join":
                    String genreJ = data[1];
                    if (!list.contains(genreJ)) {
                        list.add(genreJ);
                    }
                    break;
                case "Drop":
                    String genreD = data[1];
                    if (list.contains(genreD)) {
                        list.remove(genreD);
                    }
                    break;
                case "Replace":
                    String oldGenre = data[1];
                    String newGenre = data[2];

                    if (list.contains(oldGenre) && !list.contains(newGenre)) {
                        list.set(list.indexOf(oldGenre), newGenre);
                    }
                    break;
                case "Prefer":
                    int genreIndex1 = Integer.parseInt(data[1]);
                    int genreIndex2 = Integer.parseInt(data[2]);

                    if (genreIndex1 < list.size() && genreIndex2 < list.size()){
                        Collections.swap(list, genreIndex1, genreIndex2);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", list));
    }
}
