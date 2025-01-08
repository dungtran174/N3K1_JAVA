package array;

import java.util.Arrays;
import java.util.Scanner;

public class J02016_BoBaSoPytago {
    public static boolean check(long[] a, int n) {
        // Square all elements in the array
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * a[i];
        }
        // Sort the squared array
        Arrays.sort(a);
        // Find Pythagorean triples
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (a[left] + a[right] == a[i]) {
                    return true;
                } else if (a[left] + a[right] < a[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
