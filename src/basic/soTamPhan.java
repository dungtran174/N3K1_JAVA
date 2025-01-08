package basic;

import java.util.*;

public class soTamPhan {
    public static boolean check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > '2') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            if (check(n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
