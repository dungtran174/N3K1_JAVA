package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student9> students = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            students.add(new Student9(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        students.forEach(System.out::println);
    }
}

class Student9 {
    String id, name, birthday, rank;
    double score1, score2;

    public Student9(int i, String name, String birthday, double score1, double score2) {
        this.id = String.format("PH%02d", i);
        this.name = formatName(name);
        setBirthday(birthday);
        this.score1 = score1;
        this.score2 = score2;
        setRank();
    }

    public String formatName(String name) {
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        }
        return String.join(" ", list);
    }

    public void setBirthday(String birthday) {
        StringBuilder sb = new StringBuilder(birthday);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, '0');
        }
        this.birthday = sb.toString();
    }

    private int getAge() {
        return 2021 - Integer.parseInt(birthday.substring(6, 10));
    }

    private double getRewardScore() {
        if (score1 >= 8 && score2 >= 8)
            return 1;
        if (score1 >= 7.5 && score2 >= 7.5)
            return 0.5;
        return 0;
    }

    public int getScore() {
        return (int) Math.min(10, Math.round((score1 + score2) / 2 + getRewardScore()));
    }

    public void setRank() {
        switch (getScore()) {
            case 10:
            case 9:
                rank = "Xuat sac";
                break;
            case 8:
                rank = "Gioi";
                break;
            case 7:
                rank = "Kha";
                break;
            case 6:
            case 5:
                rank = "Trung binh";
                break;
            default:
                rank = "Truot";
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getAge() + " " + getScore() + " " + rank;
    }
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9