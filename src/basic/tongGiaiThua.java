package basic;

import java.util.*;

public class tongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = 1, sum = 1;
        for (int i = 2; i <= n; i++) {
            a *= i;
            sum += a;
        }
        System.out.println(sum);
    }
}
