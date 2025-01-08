package contest;

import java.util.*;

public class Bai2_TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int res = 0;
            StringBuilder tmp = new StringBuilder();
            for (char x : s.toCharArray()) {
                if (Character.isDigit(x)) {
                    res += x - '0';
                } else {
                    tmp.append(x);
                }
            }
            char[] chars = tmp.toString().toCharArray();
            Arrays.sort(chars);
            System.out.println(new String(chars) + res);
        }
        sc.close();
    }
}

//2
//AC2BEW3
//ACCBA10D2EW30
