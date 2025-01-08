package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai39_TinhTong {
    public static int check1(String s) { // Kiểm tra xem xâu có là số 10 chữ số không
        if (s.length() > 10) return 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return 0;
        }
        return 1;
    }

    public static long check(String s) { // Kiểm tra xem xâu có là số kiểu int không
        if (check1(s) == 0) return 0;
        long x = Long.parseLong(s);
        if (x > Integer.MAX_VALUE) return 0;
        else return x;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in")); // Đọc từ file DATA.in
            long tong = 0;
            while (sc.hasNext()) {
                String s = sc.next();
                tong += check(s);
            }
            System.out.println(tong);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
12 3 4 5 6 7
Aaa 1 1 Bbb XXX yyy 5 5
999999999999999999999999
9

58
 */