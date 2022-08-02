package FUNDAMENTALS.LAB_7_Maps_Lambda_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(3)
                .collect(Collectors.toList());

        for (int element : list){
            System.out.print(element + " ");
        }
    }
}
