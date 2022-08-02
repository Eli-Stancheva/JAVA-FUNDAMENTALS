package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.Random;
import java.util.Scanner;

public class P1_AdvertisementMessage {
    static class Message {
        private String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        private String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        public void randomMessage() {
            System.out.printf("%s %s %s - %s",
                    phrases[random.nextInt(phrases.length)],
                    events[random.nextInt(events.length)],
                    authors[random.nextInt(authors.length)],
                    cities[random.nextInt(cities.length)]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 0; i < number; i++) {
            message.randomMessage();
        }
    }
}
