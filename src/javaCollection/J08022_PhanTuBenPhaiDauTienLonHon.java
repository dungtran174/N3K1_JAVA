package javaCollection;

import java.util.Scanner;
import java.util.Stack;

public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                if (st.empty()) {
                    ans[i] = -1;
                    st.push(a[i]);
                } else {
                    while (!st.empty() && st.lastElement() <= a[i]) st.pop();
                    if (st.empty()) ans[i] = -1;
                    else ans[i] = st.lastElement();
                    st.push(a[i]);
                }
            }
            for (int i = 0; i < n; i++) System.out.printf("%d ", ans[i]);
            System.out.println();
        }
    }
}
//3
//4
//4 5 2 25
//3
//2 2 2
//4
//4 4 5 5