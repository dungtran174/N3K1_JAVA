package array;

import java.util.Scanner;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("Buoc 0: %d\n", a[0]);
        for (int i = 1; i < n; i++) {
            int pos = i - 1, val = a[i];
            while (pos >= 0 && val < a[pos]) {
                a[pos + 1] = a[pos];
                pos--;
            }
            a[pos + 1] = val;
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}
