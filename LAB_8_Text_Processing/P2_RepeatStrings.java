package FUNDAMENTALS.LAB_8_Text_Processing;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");

        List<String> list = new ArrayList<>();
        for (String word : wordArr){
            list.add(repeatString(word, word.length()));
        }
        System.out.println(String.join("", list));
    }
    public static String repeatString (String word, int count){
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
