package string;

import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            int cnt = 0;
            for (String value : s) {
                if (Integer.parseInt(value) % 2 == 0) {
                    cnt++;
                }
            }
            if(s.length % 2 == 0 && cnt > s.length - cnt || s.length % 2 != 0 && cnt < s.length - cnt) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
