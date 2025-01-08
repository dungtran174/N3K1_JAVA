package array;

import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0, ok = -1;
            int[] a = new int[n];
            int[] f = new int[n];
            //  cong don
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if (i == 0) {
                    f[i] = a[i];
                } else {
                    f[i] = f[i - 1] + a[i];
                }
            }
            for (int i = 1; i < n; i++) {
                if (f[i - 1] == sum - f[i]) {
                    ok = i + 1;
                    break;
                }
            }
            if (ok != -1) {
                System.out.println(ok);
            } else {
                System.out.println(ok);
            }
        }
    }
}
