package FUNDAMENTALS.EXERCISE_4_Methods;

        import java.util.Scanner;

public class P3_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        printChar(start, end);
    }

    public static void printChar(char start, char end) {
        if (start < end){
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
