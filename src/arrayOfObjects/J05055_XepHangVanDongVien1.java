package arrayOfObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05055_XepHangVanDongVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Athlete> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
            list.add(new Athlete(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        list.sort((a, b) -> (int) (a.getFinalAchievement() - b.getFinalAchievement()));
        list.get(0).rank = 1;
        for(int i = 1; i < n; i++) {
            list.get(i).rank = list.get(i).getFinalAchievement() == list.get(i-1).getFinalAchievement() ? list.get(i-1).rank : i + 1;
        }
        list.sort(Comparator.comparing(a -> a.id));
        list.forEach(System.out::println);
    }
}

class Athlete {
    String name, id, startTime, endTime;
    int age, rank;

    public Athlete(int i, String name, String dob, String startTime, String endTime) {
        this.name = name;
        this.id = String.format("VDV%02d", i);
        this.startTime = startTime;
        this.endTime = endTime;
        this.age = 2021 - Integer.parseInt(dob.substring(6, 10));
    }

    public long getTime(String time) { // convert to seconds
        return Integer.parseInt(time.substring(0, 2)) * 3600L + Integer.parseInt(time.substring(3, 5)) * 60L + Integer.parseInt(time.substring(6, 8));
    }

    public String secondsToString(long seconds) {
        long h = seconds / 3600;
        long m = (seconds - h * 3600) / 60;
        long s = seconds - h * 3600 - m * 60;
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
        return id + " " + name + " " + secondsToString(getAchievement()) + " " + secondsToString(getPriority()) + " " + secondsToString(getFinalAchievement()) + " " + rank;
    }
}

//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30