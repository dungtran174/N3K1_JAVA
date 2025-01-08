package javaCollection;

import java.util.*;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            while (!q.isEmpty()) {
                String tmp = q.poll();
                if (tmp.length() <= n) {
                    a.add(Long.parseLong(tmp));
                    q.add(tmp + "6");
                    q.add(tmp + "8");
                }
            }
            a.sort(Collections.reverseOrder());
            System.out.println(a.size());
            for (Long num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
