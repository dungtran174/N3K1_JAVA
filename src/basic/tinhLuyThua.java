package basic;

import java.util.*;

public class tinhLuyThua {
    static Long mod = 1000000007L;

    public static Long pow(Long n, Long k) {
        if (k == 0) {
            return 1L;
        }
        Long x = pow(n, k / 2);
        x = x * x % mod;
        if (k % 2 != 0) {
            return x * n % mod;
        } else {
            return x % mod;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Long n = sc.nextLong();
            Long k = sc.nextLong();
            if (n == 0 && k == 0)
                return;
            System.out.println(pow(n, k));
        }
    }
}
