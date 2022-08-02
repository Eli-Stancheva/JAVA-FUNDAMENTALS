package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P3_OpinionPoll {
    static class Person {
        private String name;
        private int age;

        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }

       public String getName(){
            return name;
       }

       public int getAge(){
            return age;
       }

       @Override
       public String toString(){
            return String.format("%s - %d", this.name, this.age);
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            int numberAge = Integer.parseInt(input[1]);
            Person person = new Person(name, numberAge);

            if (numberAge > 30){
                peopleList.add(person);
            }
        }
        peopleList.sort(Comparator.comparing(Person::getName));
        for(Person man : peopleList){
            System.out.println(man);
        }
    }
}
