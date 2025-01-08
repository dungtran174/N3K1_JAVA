package contest;

import java.util.*;
import java.io.*;

public class Bai16_TinhTongSoLong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext()) {
            try {
                long x = Long.parseLong(sc.next());
                if (x > Integer.MAX_VALUE) tong += x;
            } catch (Exception e) {
            }
        }
        System.out.println(tong);
    }
}
/*
12 3 4 5 6 7
123243434354546
Aaa 1 1 Bbb XXX yyy 5 5 dsfrgrt3
45646szdfse545
44444444444444
999999999999999999999999999
9876543456
9

167697755342446
 */