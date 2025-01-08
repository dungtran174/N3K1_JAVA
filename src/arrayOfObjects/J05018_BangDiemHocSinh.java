package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HS> hs = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            hs.add(new HS(i, sc.nextLine(), sc.nextLine().trim().split("\\s+")));
        }
        hs.sort((a, b) -> a.average != b.average ? (a.average < b.average ? 1 : -1) : a.id.compareTo(b.id));
        hs.forEach(System.out::println);
    }
}

class HS {
    String id, name;
    double average;

    public HS(int id, String name, String[] score) {
        this.id = String.format("HS%02d", id);
        this.name = name;
        this.average = getAverage(score);
    }

    public double getAverage(String[] score) {
        double res = Double.parseDouble(score[0]) * 2 + Double.parseDouble(score[1]) * 2;
        for (int i = 2; i < score.length; i++) {
            res += Double.parseDouble(score[i]);
        }
        return res / 12;
    }

    String getRank() {
        if (average >= 9) return "XUAT SAC";
        if (average >= 8) return "GIOI";
        if (average >= 7) return "KHA";
        if (average >= 5) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", Math.round(average * 10.0) / 10.0) + " " + getRank();
    }
}
//3
//Luu Thuy Nhi
//9.3 9.0 7.1 6.5 6.2 6.0 8.2 6.7 4.8 5.5
//Le Van Tam
//8.0 8.0 5.5 9.0 6.8 9.0 7.2 8.3 7.2 6.8
//Nguyen Thai Binh
//9.0 6.4 6.0 7.5 6.7 5.5 5.0 6.0 6.0 6.0