package contest;

import java.util.*;
import java.io.*;

public class Bai40_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream FileIS = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(FileIS);
        ArrayList<Integer> a = (ArrayList<Integer>) is.readObject();
        int[] cnt = new int[1005];
        for (int x : a) cnt[x]++;
        for (int i = 0; i < 1000; i++) {
            if (cnt[i] != 0) System.out.println(i + " " + cnt[i]);
        }
    }
}
/*
Liệt kê các số tăng dần. Ví dụ:
10 2
23 1
24 1
25 4
 */