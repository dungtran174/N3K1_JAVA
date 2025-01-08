package javaCollection;

import java.util.Scanner;
import java.util.Stack;

public class J08027_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (!a.isEmpty()) b.push(a.pop());
            } else if (s.charAt(i) == '>') {
                if (!b.isEmpty()) a.push(b.pop());
            } else if (s.charAt(i) == '-') {
                if (!a.isEmpty()) a.pop();
            } else {
                a.push(s.charAt(i));
            }
        }
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        while (!b.isEmpty()) System.out.print(b.pop());
    }
}
//<<PI<T>>Ta-