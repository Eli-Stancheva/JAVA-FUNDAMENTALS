package FUNDAMENTALS.LAB_6_ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5_Students {
    static class Student {
        String name;
        String lastName;
        String age;
        String homeTown;

        public Student(String name, String lastName, String age, String homeTown) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> list = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String name = data[0];
            String lastName = data[1];
            String age = data[2];
            String homeTown = data[3];

            Student student = new Student(name, lastName, age, homeTown);

            list.add(student);
            input = scanner.nextLine();
        }
        String searchedTown = scanner.nextLine();
        for (Student man : list) {
            if (man.getHomeTown().equals(searchedTown)) {
                System.out.printf("%s %s is %s years old\n", man.getName(), man.getLastName(), man.getAge());
            }
        }
    }
}
