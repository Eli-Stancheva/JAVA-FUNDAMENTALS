package FUNDAMENTALS.LAB_5_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P6_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();

            list.add(product);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, list.get(i));
        }
    }
}
