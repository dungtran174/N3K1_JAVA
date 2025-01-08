package basic;

import java.util.*;

public class chuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        long n = sc.nextLong();
        while (n > 0) {
            if (n % 10 == 4 || n % 10 == 7) {
                cnt++;
            }
            n /= 10;
        }
        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
