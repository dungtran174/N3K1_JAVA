package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05051_SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<receipt1> li = new ArrayList<>();
        for(int i = 1; i <= t; i++) {
            li.add(new receipt1(i, sc.next(), sc.nextInt(), sc.nextInt()));
        }
        li.sort((a, b) -> (int) (b.getTotal() - a.getTotal()));
        li.forEach(System.out::println);
    }
}

class receipt1 {
    String type, id;
    int oldIndex, newIndex;

    public receipt1(int i, String type, int oldIndex, int newIndex) {
        this.type = type;
        this.id = String.format("KH%02d", i);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public long getFactor() {
        switch (type) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
            default:
                return 0;
        }
    }

    public long toMoney() {
        return (newIndex - oldIndex) * getFactor() * 550;
    }

    public long getExtra() {
        int t = newIndex - oldIndex;
        if (t < 50) return 0;
        if (t <= 100) return (long) Math.round(toMoney() / 100.0 * 35);
        return toMoney();
    }

    public long getTotal() {
        return getExtra() + toMoney();
    }

    @Override
    public String toString() {
        return id + " " + getFactor() + " " + toMoney() + " " + getExtra() + " " + getTotal();
    }
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700