package contest;

import java.util.*;
import java.io.*;

class WordSet {
    private TreeSet<String> ts;

    public WordSet(String s) {
        this.ts = new TreeSet<>();
        String[] a = s.toLowerCase().split("\\s+");
        for (String x : a) this.ts.add(x);
    }

    public WordSet union(WordSet b) {
        WordSet res = new WordSet("");
        for (String x : this.ts) res.ts.add(x);
        for (String x : b.ts) res.ts.add(x);
        return res;
    }

    public WordSet intersection(WordSet b) {
        WordSet res = new WordSet("");
        for (String x : this.ts) {
            if (b.ts.contains(x)) res.ts.add(x);
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (String x : this.ts) res += x + " ";
        return res.trim();
    }
}

public class Bai28_TapTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
/*
Lap trinh huong doi tuong
Ngon ngu lap trinh C++

c++ doi huong lap ngon ngu trinh tuong
lap trinh
 */