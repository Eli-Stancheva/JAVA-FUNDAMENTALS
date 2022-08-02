package FUNDAMENTALS.EXERCISE_6_ObjectsClasses;

import java.util.*;
import java.util.stream.Collectors;

public class P5_Students {
    static class Student {
        private String name;
        private String lastName;
        private double grade;

        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }


        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countStudents; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student student = new Student(name, lastName, grade);

            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student man : studentList) {
            System.out.println(man);
        }
    }
}
