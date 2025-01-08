package javaCollection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n; i++) {
                while(!st.isEmpty() && a[i] >= a[st.peek()]) {
                    st.pop();
                }
                list.add(st.isEmpty() ? i + 1 : i - st.peek());
                st.push(i);
            }
            list.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }
}
//1
//7
//100 80 60 70 60 75 85