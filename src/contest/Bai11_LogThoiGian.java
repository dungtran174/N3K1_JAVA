package contest;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai11_LogThoiGian {
    public static boolean check(String s) {
        if (s.trim().length() != 8) return false;
        if (s.charAt(2) != ':' && s.charAt(5) != ':') return false;
        String[] a = s.trim().split(":");
        int a0 = Integer.parseInt(a[0]), a1 = Integer.parseInt(a[1]), a2 = Integer.parseInt(a[2]);
        if (a0 >= 0 && a0 <= 23 && a1 >= 0 && a1 <= 59 && a2 >= 0 && a2 <= 59) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNext()) {
            String tmp = sc.next();
            s += tmp + " ";
        }
        s = s.replace(".", " ");
        s = s.replace(",", " ");
        TreeSet<String> ts = new TreeSet<>();//lưu các xâu thời gian thỏa mãn
        String[] a = s.trim().split("\\s+");
        for (String x : a) {
            if (check(x)) ts.add(x);
        }
        for (String x : ts) System.out.println(x);
    }
}
//[BeginLog]
//[Boot Session: 2023/01/31 10:22:00.500]
//09:50:44.356  WINWORD (0x43A4)
//Section 2023/01/31 10:22:16, 538new
//{FILE_QUEUE_COMMIT} 10:22:16.569
//Start: 14:17:50.111over
//End: 14:17:50.899over