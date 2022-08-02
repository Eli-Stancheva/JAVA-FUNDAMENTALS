package FUNDAMENTALS.MID_EXAM_2;

import java.util.*;
import java.util.stream.Collectors;

public class P2_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] data = input.split(" ");
            String command = data[0];

            switch (command){
                case "swap":
                    int indexSwap1 = Integer.parseInt(data[1]);
                    int indexSwap2 = Integer.parseInt(data[2]);
                    Collections.swap(list, indexSwap1, indexSwap2);
                    break;
                case "multiply":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);

                    int product = list.get(index1) * list.get(index2);
                    list.set(index1, product);
                    break;
                case "decrease":
                    for (int i = 0; i < list.size(); i++) {
                       int dec = list.get(i) - 1;
                       list.set(i, dec);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        List<String> stringList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            stringList.add(String.valueOf(list.get(i)));
        }
        System.out.println(String.join(", ", stringList));
    }
}
