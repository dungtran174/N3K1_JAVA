package string;

import java.util.Scanner;

public class J03040_BienSoDep {
    public static boolean check(String a) {
        if (a.charAt(6) > a.charAt(5) && a.charAt(7) > a.charAt(6) && a.charAt(9) > a.charAt(7) && a.charAt(10) > a.charAt(9))
            return true;
        if (a.charAt(6) == a.charAt(5) && a.charAt(7) == a.charAt(6) && a.charAt(10) == a.charAt(9))
            return true;
        for (int i = 5; i <= 10; i++) {
            if (i != 8) {
                if (a.charAt(i) != '6' && a.charAt(i) != '8') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88
