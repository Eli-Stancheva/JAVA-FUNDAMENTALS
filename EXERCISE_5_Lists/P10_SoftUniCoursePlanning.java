package FUNDAMENTALS.EXERCISE_5_Lists;

import jdk.jshell.JShell;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String commands = tokens[0];
            String lesson = tokens[1];

            switch (commands) {
                case "Add":
                    if (!schedule.contains(lesson)) {
                        schedule.add(lesson);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.contains(lesson)) {
                        schedule.add(index, lesson);
                    }
                    break;
                case "Remove":
                    if (schedule.contains(lesson)) {
                        schedule.remove(lesson);
                    }
                    int indexLesson = schedule.indexOf(lesson);
                    if (schedule.get(indexLesson + 1).equals(lesson + "-Exercise")) {
                        schedule.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lesson2 = input.split(":")[2];
                    if (schedule.contains(lesson) && schedule.contains(lesson2)) {
                        int lessonIndex1 = schedule.indexOf(lesson);
                        int lessonIndex2 = schedule.indexOf(lesson2);
                        schedule.set(lessonIndex1, lesson2);
                        schedule.set(lessonIndex2, lesson);

                        String exOne = lesson + "-Exercise";
                        String exTwo = lesson2 + "-Exercise";
                        if (schedule.contains(exOne)) {
                            schedule.remove(schedule.indexOf(exOne));
                            schedule.add(schedule.indexOf(lesson + 1), exOne);
                        }
                        if (schedule.contains(exTwo)) {
                            schedule.remove(schedule.indexOf(exTwo));
                            schedule.add(schedule.indexOf(lesson2) + 1, exTwo);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = lesson + "-Exercise";
                    int indexLessonTitle = schedule.indexOf(lesson);
                    if (schedule.contains(lesson)) {
                        if (indexLessonTitle == schedule.size() - 1) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        schedule.add(lesson);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        print(schedule);
    }
    private static void print (List<String> schedule){
        int count = 1;
        for(String element : schedule){
            System.out.println(count + "." + element);
            count++;
        }
    }
}
