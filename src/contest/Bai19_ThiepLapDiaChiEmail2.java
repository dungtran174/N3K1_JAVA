package contest;

import java.util.*;
import java.io.*;

public class Bai19_ThiepLapDiaChiEmail2 {
    public static String chuanhoa1(String s) {
        String[] a = s.trim().split("\\s+");
        String res = a[a.length - 1];
        for (int i = 0; i <= a.length - 2; i++) res += a[i].charAt(0);
        return res;
    }

    public static String chuanhoa2(String s) {
        String[] a = s.trim().split("\\s+");
        String res = "";
        for (String x : a) res += x.toLowerCase() + " ";
        return res;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            hs.add(chuanhoa2(s));
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String x : hs) {
            String s = chuanhoa1(x);
            System.out.print(s);
            if (hm.containsKey(s)) hm.put(s, hm.get(s) + 1);
            else hm.put(s, 1);
            if (hm.get(s) > 1) System.out.print(hm.get(s));
            System.out.println("@ptit.edu.vn");
        }
    }
}
/*
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
NGO QUOC VINH
Tran THI THU huong
 */