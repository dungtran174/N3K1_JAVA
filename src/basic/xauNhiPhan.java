package basic;

import java.util.*;

public class xauNhiPhan {
    static long[] f = new long[93];

    public static int find(int n, long k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (k <= f[n - 2]) {
            return find(n - 2, k);
        } else {
            return find(n - 1, k - f[n - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(n, k));
        }
    }
}
