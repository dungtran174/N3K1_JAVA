package string;

import java.util.Scanner;

public class J03008_SoDep3 {
    public static boolean check(String s) {
        int l = s.length();
        for (int i = 0; i <= l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
            int k = s.charAt(i) - '0';
            if (k != 2 && k != 3 && k != 5 && k != 7) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
