package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Articles {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        public void setContent(String content) {
            this.content = content;
        }


        public void setAuthor(String author) {
            this.author = author;
        }


        public String toString(){
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        String title = inputList.get(0);
        String content = inputList.get(1);
        String author = inputList.get(2);
        Article article = new Article(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String newValue = data[1];

            switch (command) {
                case "Edit":
                    article.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newValue);
                    break;
                case "Rename":
                    article.setTitle(newValue);
                    break;
            }
        }
        System.out.println(article);
    }
}
