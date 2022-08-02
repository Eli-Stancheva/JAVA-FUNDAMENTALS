package FUNDAMENTALS.LAB_6_ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4_Songs {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSong = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currSong = new Song();
            currSong.setTypeList(type);
            currSong.setName(name);
            currSong.setTime(time);

            listSong.add(currSong);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : listSong) {
                System.out.println(item.getName());
            }
        } else {
            for(Song item : listSong){
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
