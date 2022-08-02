package FUNDAMENTALS.EXERCISE_5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P9_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distances.size() - 1) {
                int removedElement = distances.get(index);
                sum += removedElement;
                distances.remove(index);
                changeElements(distances, removedElement);
            } else if (index < 0){
                int removedElement = distances.get(0);
                int lastElement = distances.get(distances.size() - 1);
                sum += removedElement;
                distances.set(0, lastElement);
                changeElements(distances, removedElement);
            } else if (index > distances.size() - 1) {
                int firstElement = distances.get(0);
                int removedElement = distances.get(distances.size() - 1);
                sum += removedElement;
                distances.set(distances.size() - 1, firstElement);
                changeElements(distances, removedElement);
            }
        }
        System.out.println(sum);
    }

    private static void changeElements(List<Integer> distances, int removeElement) {
        for (int i = 0; i <= distances.size() - 1; i++) {
            int current = distances.get(i);
            if (current <= removeElement) {
                current += removeElement;
            } else {
                current -= removeElement;
            }
            distances.set(i, current);
        }
    }
}
