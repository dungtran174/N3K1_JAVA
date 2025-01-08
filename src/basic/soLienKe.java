package basic;

import java.util.*;

public class soLienKe {
    public static boolean tach(long n) {
        long last = n % 10;
        n /= 10;
        while (n > 0) {
            long cur = n % 10;
            if (Math.abs(cur - last) != 1) {
                return false;
            }
            last = cur;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (tach(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
