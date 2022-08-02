package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P7_OrderByAge {
    static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] arr = input.split("\\s+");

            String name = arr[0];
            String id = arr[1];
            int age = Integer.parseInt(arr[2]);
            Person person = new Person(name, id, age);

            personList.add(person);

            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for(Person men : personList){
            System.out.println(men);
        }
    }
}
