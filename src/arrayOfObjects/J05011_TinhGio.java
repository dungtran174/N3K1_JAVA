package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Player> pl = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pl.add(new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        pl.sort((a, b) -> b.time - a.time);
        pl.forEach(System.out::println);
    }
}

class Player {
    String id, name, start, end;
    int time;

    public Player(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.time = 60 * (Integer.parseInt(end.substring(0, 2)) - Integer.parseInt(start.substring(0, 2)))
                + Integer.parseInt(end.substring(3)) - Integer.parseInt(start.substring(3));
    }

    public String getTime() {
        int h = time / 60;
        int m = time % 60;
        return String.format("%d gio %d phut", h, m);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getTime();
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00