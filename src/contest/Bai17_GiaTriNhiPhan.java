package contest;

import java.util.*;
import java.io.*;

public class Bai17_GiaTriNhiPhan {
    public static String change(String s) {
        String res = "";
        for (char x : s.toCharArray()) {
            if (x == '0' || x == '1') res += Character.toString(x);
        }
        return res;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String s1 = change(s);
            long x = Long.parseLong(s1, 2);
            System.out.println(s1 + " " + x);
        }
    }
}
/*
Gồm một ArrayList<String> với mỗi String là một dãy chữ số.  Có thể ví dụ ở dạng ký tự như dưới đây:
5678321010286421
9999999000000000000000000

10101 21
000000000000000000 0
 */