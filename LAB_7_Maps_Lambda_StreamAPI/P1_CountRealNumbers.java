package FUNDAMENTALS.LAB_7_Maps_Lambda_StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numMap = new TreeMap<>();

        for (double num : numbers){
            if (numMap.containsKey(num)){
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numMap.entrySet()){
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
