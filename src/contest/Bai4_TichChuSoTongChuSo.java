package contest;

import java.math.BigInteger;
import java.util.Scanner;
public class Bai4_TichChuSoTongChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String number = sc.nextLine();
            BigInteger e = BigInteger.ONE;
            long o = 0;
            boolean has = false; // Đánh dấu nếu có chữ số khác 0 ở vị trí chẵn
            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';
                if (i % 2 == 0) {
                    if (digit != 0) {
                        e = e.multiply(BigInteger.valueOf(digit));
                        has = true;
                    }
                } else {
                    o += digit;
                }
            }
            // Nếu không có chữ số nào ở vị trí chẵn khác 0, đặt tích bằng 0
            if (!has) {
                e = BigInteger.ZERO;
            }
            System.out.println(e + " " + o);
        }
        sc.close();
    }
}
//3
//12345678
//20000
//22334455667788