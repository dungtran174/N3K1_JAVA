package basic;

import java.util.Arrays;
import java.util.Scanner;

public class hinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int h = Math.max(a[3] - a[0], b[3] - b[0]);
        System.out.println(h * h);
    }
}
