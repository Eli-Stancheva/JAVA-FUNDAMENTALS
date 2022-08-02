package FUNDAMENTALS.LAB_6_ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6_Students2 {
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

        public void setAge(String age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
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

            int index = studentIndex(list, student.getName(), student.getLastName());
            if (index != -1){
                list.get(index).setAge(student.getAge());
                list.get(index).setHomeTown(student.getHomeTown());
            } else {
                list.add(student);
            }

            input = scanner.nextLine();
        }
        String searchedTown = scanner.nextLine();
        for (Student man : list) {
            if (man.getHomeTown().equals(searchedTown)) {
                System.out.printf("%s %s is %s years old\n", man.getName(), man.getLastName(), man.getAge());
            }
        }
    }

    public static int studentIndex(List<Student> students, String name, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            String nameList = students.get(i).getName();
            String lastNameList = students.get(i).getLastName();

            if (nameList.equals(name) && lastNameList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
