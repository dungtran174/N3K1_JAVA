package basic;

import java.util.Scanner;

public class soChinhPhuong {
    public static boolean cp(long n) {
        long a = (long) Math.sqrt(n);
        if (a * a == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (cp(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
