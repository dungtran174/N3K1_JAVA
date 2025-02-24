package array;

import java.util.Scanner;

public class J02036_UocSoChungLonNhat {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n + 1];
            b[0] = a[0];
            b[n] = a[n - 1];
            for (int i = 1; i < n; i++) {
                b[i] = lcm(a[i - 1], a[i]);
            }
            for (int i = 0; i <= n; i++) {
                System.out.printf("%d ", b[i]);
            }
            System.out.println();
        }
    }
}
