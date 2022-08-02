package FUNDAMENTALS.MID_RETAKE_EXAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command){
                case "Change":
                    int paintingNumber = Integer.parseInt(data[1]);
                    int newNumber = Integer.parseInt(data[2]);

                    if (list.contains(paintingNumber)){
                        list.set(list.indexOf(paintingNumber), newNumber);
                    }
                    break;
                case "Hide":
                    int paintingNumberH = Integer.parseInt(data[1]);
                    if (list.contains(paintingNumberH)) {
                        list.remove(list.indexOf(paintingNumberH));
                    }
                    break;
                case "Switch":
                    int paintingNumber1 = Integer.parseInt(data[1]);
                    int paintingNumber2 = Integer.parseInt(data[2]);
                    if (list.contains(paintingNumber1) && list.contains(paintingNumber2)){
                        Collections.swap(list, list.indexOf(paintingNumber1), list.indexOf(paintingNumber2));
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    int paintingNumberI = Integer.parseInt(data[2]);

                    if (index + 1 < list.size()){
                        list.add(index + 1, paintingNumberI);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(list);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
