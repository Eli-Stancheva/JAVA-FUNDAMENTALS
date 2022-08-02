package FUNDAMENTALS.LAB_8_Text_Processing;

import java.util.Scanner;

public class P4_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String word : input){
            if (text.contains(word)){
                String replace = stringRepeat("*", word.length());
                text =  text.replace(word, replace);
            }
        }
        System.out.println(text);
    }

    public static String stringRepeat(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
