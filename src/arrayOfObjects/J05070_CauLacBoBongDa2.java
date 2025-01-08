package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Club1> club = new ArrayList<>();
        for (int i = 0; i < n; i++)
            club.add(new Club1(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match1> match = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tmp = sc.nextLine().split("\\s+");
            String id = tmp[0].substring(1, 3);
            for (Club1 j : club)
                if (j.id.equals(id))
                    match.add(new Match1(tmp[0], j, Integer.parseInt(tmp[1])));
        }
        match.sort((a, b) -> a.income() == b.income() ? a.club.name.compareTo(b.club.name) : b.income() - a.income());
        match.forEach(System.out::println);
        sc.close();
    }
}

class Club1 {
    String id, name;
    int price;

    public Club1(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Match1 {
    String id;
    Club1 club;
    int amount;

    public Match1(String id, Club1 club, int amount) {
        this.id = id;
        this.club = club;
        this.amount = amount;
    }

    public int income() {
        return club.price * amount;
    }

    @Override
    public String toString() {
        return id + " " + club.name + " " + income();
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
