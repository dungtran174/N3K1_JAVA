package contest;

import java.util.*;

public class Bai3_UocSoNguyenToLonNhat {
    static boolean nto(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    res = i;
                    n /= i;
                }
            }
            if (n > 1) res = n;
            System.out.println(res);
        }
    }
}
//2
//315
//31