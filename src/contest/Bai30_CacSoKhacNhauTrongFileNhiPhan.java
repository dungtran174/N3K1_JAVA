package contest;

import java.util.*;
import java.io.*;

public class Bai30_CacSoKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for (String s : a) {
            String[] tmp = s.trim().split("\\s+");
            for (String x : tmp) {
                try {
                    int number = Integer.parseInt(x);
                    ts.add(number);
                } catch (NumberFormatException e) {
                }
            }
        }
        for (int x : ts) System.out.println(x);
    }
}
/*
File nhị phân như mô tả.
Ví dụ các dòng văn bản trong dữ liệu có thể như sau:
Java Programming 5 has 371 pages.
More than 70 % …

5
70
371
 */