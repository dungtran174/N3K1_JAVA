package string;

import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toLowerCase().toCharArray();
        HashSet<Character> se = new HashSet<>();
        for(char x : s) {
            se.add(x);
        }
        System.out.println(se.size());
        sc.close();
    }
}
