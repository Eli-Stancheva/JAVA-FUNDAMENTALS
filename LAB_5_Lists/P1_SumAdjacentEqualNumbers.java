package FUNDAMENTALS.LAB_5_Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);

                i = -1;
            }
        }
        System.out.println(joinElements(numbers, " "));
    }

    public static String joinElements(List<Double> numbers, String delimiter){
        String output = "";
        for(Double item : numbers){
            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(item) + delimiter;

            output += numDf;
        }
        return output;
    }
}
