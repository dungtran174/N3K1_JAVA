package basic;

import java.util.*;

public class uocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        cnt++;
                    }
                    if ((i != n / i) && (n / i) % 2 == 0) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
