package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05056_XepHangVanDongVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Athlete1> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new Athlete1(i+ 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        list.sort((a, b) -> (int) (a.getFinalAchievement() - b.getFinalAchievement()));
        list.get(0).rank = 1;
        for(int i = 1; i < n; i++) {
            list.get(i).rank = list.get(i).getFinalAchievement() == list.get(i - 1).getFinalAchievement() ? list.get(i - 1).rank : i + 1;
        }
        list.forEach(System.out::println);
    }
}

class Athlete1 {
    String id, name, startTime, endTime;
    int rank, age;

    public Athlete1(int i, String name, String dob, String startTime, String endTime) {
        this.id = String.format("VDV%02d", i);
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.age = 2021 - Integer.parseInt(dob.substring(6, 10));
    }

    public long getTime(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 3600L + Integer.parseInt(time.substring(3, 5)) * 60L + Integer.parseInt(time.substring(6, 8));
    }

    public String secondsToString(long seconds) {
        long h = seconds / 3600;
        long m = (seconds - h * 3600) / 60;
        long s = seconds % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public long getPriority() {
        if (age < 18) return 0;
        if (age < 25) return 1;
        if (age < 32) return 2;
        return 3;
    }

    public long getAchievement() {
        return getTime(endTime) - getTime(startTime);
    }

    public long getFinalAchievement() {
        return getTime(endTime) - getTime(startTime) - getPriority();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + secondsToString(getAchievement()) + " " +
            secondsToString(getPriority()) + " " + secondsToString(getFinalAchievement()) + " " + rank;
    }
}
