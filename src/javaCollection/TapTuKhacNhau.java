package javaCollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class WordSet {
    TreeSet<String> set;

    WordSet(String s) {
        set = new TreeSet<>();
        set.addAll(Arrays.asList(s.trim().toLowerCase().split("\\s+")));
    }

    String union(WordSet other) {
        TreeSet<String> union = (TreeSet<String>) set.clone();
        union.addAll(other.set);
        return String.join(" ", union);
    }

    String intersection(WordSet other) {
        TreeSet<String> intersection = (TreeSet<String>) set.clone();
        intersection.retainAll(other.set);
        return String.join(" ", intersection);
    }
}

public class TapTuKhacNhau {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}