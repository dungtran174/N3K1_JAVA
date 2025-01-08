package contest;

import java.util.*;

public class Bai1_TimTuDaiNhat {
//    static boolean dao(String s) {
//        return s.equals(new StringBuilder(s).reverse().toString());
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (list.isEmpty()) {
                list.add(s);
            }
            if (!list.isEmpty() && s.length() > list.get(0).length()) {
                list.clear();
                list.add(s);
            }
        }
        list.forEach(e -> System.out.println(e + " - " + e.length()));
    }
}
//Lap trinh C++
//Cau truc du lieu va giai do