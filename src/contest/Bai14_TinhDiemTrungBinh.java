package contest;

import java.util.*;

public class Bai14_TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextDouble();

        double Min = a[0], Max = a[0];
        for (int i = 1; i < n; i++) {
            Max = Double.max(Max, a[i]);
            Min = Double.min(Min, a[i]);
        }
        double tong = 0;
        int cnt = 0;
        for (double x : a) {
            if (x != Max && x != Min) {
                tong += x;
                cnt++;
            }
        }
        System.out.printf("%.2f", tong / cnt);
        sc.close();
    }
}
//6
//6.75 8 9.2 7.25 7.75 6.75