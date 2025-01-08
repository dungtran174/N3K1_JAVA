package string;

import java.util.Scanner;
import java.util.Stack;

public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            //Nếu stack không rỗng và xét ký tự hiện tại trên đỉnh stack nhưng không xóa
            if(!st.isEmpty() && st.peek() == c) {
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        if (st.isEmpty()) {
            System.out.println("Empty String");
        }
        else {
            StringBuilder res = new StringBuilder();
            for(char c : st) {
                res.append(c);
            }
            System.out.println(res);
        }
        sc.close();
    }
}
