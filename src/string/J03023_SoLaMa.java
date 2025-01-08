package string;

import java.util.HashMap;
import java.util.Scanner;

public class J03023_SoLaMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] b = {1, 5, 10, 50, 100, 500, 1000};
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            map.put(a[i], b[i]);
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            char[] s = sc.nextLine().toCharArray();
            int n = s.length, res = 0;
            for (int i = 0; i < n; i++) {
                int k1 = map.get(s[i]), k2 = 0;
                if (i != n - 1)
                    k2 = map.get(s[i + 1]);
                if (k1 < k2) {
                    res += k2 - k1;
                    i++;
                }
                else res += k1;
            }
            System.out.println(res);
        }
    }
}
//3
//XIX
//DC
//CD