package string;

import java.util.Scanner;

public class J03007_SoDep2 {
    public static boolean check(String s) {
        int sum = 0;
        for (char x : s.toCharArray()) {
            sum += x - '0';
        }
        int l = s.length();
        for (int i = 0; i <= l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
        }
        if (s.charAt(0) != '8' || s.charAt(l - 1) != '8') {
            return false;
        }
        if (sum % 10 != 0) return false;
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
