package basic;

import java.util.*;

public class tinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[93];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
