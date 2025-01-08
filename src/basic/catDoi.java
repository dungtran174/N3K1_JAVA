package basic;

import java.util.*;

public class catDoi {
    public static long cat(String s) {
        long sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                sum = sum * 10 + 1;
            } else if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                sum = sum * 10;
            } else {
                sum = -1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long sum = cat(s);
            if (sum > 0) {
                System.out.println(sum);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
