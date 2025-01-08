package javaCollection;

import java.util.*;

public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            Stack<Character> a = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (a.empty()) a.push(s.charAt(i));
                else {
                    if(a.lastElement() == '(' && s.charAt(i) ==')') a.pop();
                    else if(a.lastElement() == '{' && s.charAt(i) =='}') a.pop();
                    else if(a.lastElement() == '[' && s.charAt(i) ==']') a.pop();
                    else  a.push(s.charAt(i));
                }
            }
//            System.out.println(a.size());
            System.out.println(a.empty() ? "YES" : "NO");
        }
    }
}
//2
//[()]{}{[()()]()}
//[(])
