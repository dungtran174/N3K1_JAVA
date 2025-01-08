package basic;

import java.util.*;

public class kiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int check = 1;
            for (int i = 0; i <= 92; i++) {
                if (n == f[i]) {
                    check = 0;
                }
            }
            if (check == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
