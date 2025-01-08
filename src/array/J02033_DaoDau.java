package array;

import java.util.Arrays;
import java.util.Scanner;

public class J02033_DaoDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n && k > 0; i++) {
            //biến đổi các số âm
            if (a[i] < 0) {
                a[i] = -a[i];
                k--;
            }
        }
        // Nếu k là số lẻ, đổi thêm 1 lần nữa
        if (k % 2 == 1) {
            Arrays.sort(a);
            a[0] = -a[0];
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
