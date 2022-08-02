package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.*;
import java.util.stream.Collectors;

public class P4_Articles2 {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }


        public String getAuthor() {
            return author;
        }

        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> savedList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");

            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);

            savedList.add(article);
        }
        String criteria = scanner.nextLine();

        switch (criteria) {
            case "title":
                savedList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                savedList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                savedList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        for (Article item : savedList) {
            System.out.println(item);
        }
    }
}
