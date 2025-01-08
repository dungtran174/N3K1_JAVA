package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String>a = (ArrayList<String>) o.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> s1 = new LinkedHashSet<>();
        LinkedHashSet<String> s2 = new LinkedHashSet<>();
        for(String x : a) {
            String[] tmp = x.trim().toLowerCase().split("\\s+");
            s1.addAll(Arrays.asList(tmp));
        }
        while(sc.hasNext()) {
            String s = sc.next().toLowerCase();
            s2.add(s);
        }
        for(String x : s2) {
            if(s1.contains(x)) {
                System.out.println(x);
            }
        }
    }
}
