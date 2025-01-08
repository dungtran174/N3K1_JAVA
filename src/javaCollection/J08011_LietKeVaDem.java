package javaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J08011_LietKeVaDem {
    public static boolean khongGiam(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (khongGiam(s)) {
                if (map.get(s) != null) map.put(s, map.get(s) + 1);
                else {
                    map.put(s, 1);
                    list.add(s);
                }
            }
        }
        list.sort((a, b) -> map.get(b) - map.get(a));
        list.forEach(e -> System.out.println(e + " " + map.get(e)));
    }
}
//123 321 23456 123 123 23456
//3523 123 321 4567 8988 78 7654
//9899 3456 123 678 999 78 3456
//987654321 4546 63543 4656 13432
//4563 123471 659837 454945 34355
//9087 9977 98534 3456 23134
