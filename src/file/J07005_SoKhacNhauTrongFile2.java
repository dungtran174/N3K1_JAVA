package file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        DataInputStream is = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> a = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int x = is.readInt();
            a.put(x, a.getOrDefault(x, 0) + 1);
        }
        a.forEach((k, v) -> {
            System.out.printf("%d %d\n", k, v);
        });
    }
}
/*
Liệt kê các số tăng dần, ví dụ:
10 2
21 1
25 4
 */