package file;

import java.util.*;
import java.io.*;

public class J07014_HopVaGiaoCuaHaiFileVanBan {
    public static void main(String[] args) throws IOException {
        WordSet1 s1 = new WordSet1("DATA1.in");
        WordSet1 s2 = new WordSet1("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet1 {
    private TreeSet<String> set;

    public WordSet1(String file) throws IOException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext())
            set.add(sc.next().toLowerCase());
    }

    public TreeSet<String> getSet() {
        return this.set;
    }

    public String intersection(WordSet1 o) {
        TreeSet<String> set2 = o.getSet();
        TreeSet<String> res = new TreeSet<>();
        set.forEach(e -> {
            if (set2.contains(e))
                res.add(e);
        });
        return String.join(" ", res);
    }

    public String union(WordSet1 o) {
        TreeSet<String> set2 = o.getSet();
        TreeSet<String> res = new TreeSet<>(set2);
        res.addAll(set);

        return String.join(" ", res);
    }
}