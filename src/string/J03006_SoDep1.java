package string;

import java.util.Scanner;

public class J03006_SoDep1 {
    public static boolean check(String s) {
        int l = s.length();
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1) || (s.charAt(i) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n;
            n = sc.next();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
