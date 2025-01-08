package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String k = sc.nextLine();
            int h = Integer.parseInt(sc.nextLine());
            Set<Character> s = new HashSet<>();
            for(int i = 0; i < k.length(); i++) {
                s.add(k.charAt(i));
            }
            System.out.println((k.length() >= 26 && s.size() + h >= 26) ? "YES" : "NO");
        }
    }
}
