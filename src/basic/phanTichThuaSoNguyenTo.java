package basic;

import java.util.*;

public class phanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", i);
            for (int k = 2; k < Math.sqrt(n); k++) {
                if (n % k == 0) {
                    int mu = 0;
                    while (n % k == 0) {
                        mu++;
                        n /= k;
                    }
                    System.out.printf("%d(%d)", k, mu);
//                    if(mu > 0) {
//                        System.out.printf("%d(%d) ", k, mu);
//                    } cách 1
                }
                if (n != 1) {
                    System.out.print(" ");
                }
            }
            if (n > 1) {
                System.out.printf("%d(1)", n);
            }
            System.out.println();
        }
    }
}
