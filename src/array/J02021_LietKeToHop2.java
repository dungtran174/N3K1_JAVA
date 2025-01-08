package array;

import java.util.Scanner;

public class J02021_LietKeToHop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        int k = sc.nextInt();
        int[] a = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
        while (true) {
            s++;
            boolean check = true;
            for (int i = 1; i <= k; i++) {
                System.out.printf("%d", a[i]);
            }
            System.out.print(" ");
            for (int i = k; i >= 1; i--) {
                if (a[i] != n - k + i) {
                    a[i]++;
                    check = false;
                    for (int j = i + 1; j <= k; j++) {
                        a[j] = a[j - 1] + 1;
                    }
                    break;
                }
            }
            if (check) {
                break;
            }
        }
        System.out.printf("\nTong cong co %d to hop", s);
    }
}
