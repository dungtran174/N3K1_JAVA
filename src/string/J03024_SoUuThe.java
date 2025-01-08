package string;

import java.util.Scanner;

public class J03024_SoUuThe {
    public static int check(String s) {
        int demle = 0;
        int demchan = 0;
        if (s.charAt(0) == '0') {
            return -1;
        }
        for (char x : s.toCharArray()) {
            if (!Character.isDigit(x)) {
                return -1;
            }
            int k = x - '0';
            if (k % 2 == 0) {
                demchan++;
            } else {
                demle++;
            }
        }
        if ((s.length() % 2 == 0 && demchan > demle) || (s.length() % 2 == 1 && demle > demchan)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            int result = check(s);
            if (result == -1) {
                System.out.println("INVALID");
            } else if (result == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
