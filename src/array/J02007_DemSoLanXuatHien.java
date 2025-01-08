package array;

import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            System.out.printf("Test %d:\n", k);
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dem = new int[100001];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                dem[a[i]] += 1;
            }
            for (int i = 0; i < n; i++) {
                if (dem[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], dem[a[i]]);
                    dem[a[i]] = 0;
                }
            }
        }
    }
}
