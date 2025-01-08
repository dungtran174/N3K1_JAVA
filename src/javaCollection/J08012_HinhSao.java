package javaCollection;

import java.util.Scanner;

public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ke[] = new int[n + 1];
        for(int i = 0; i < n - 1; i++) {
            int x = sc.nextInt(); int y = sc.nextInt();
            ke[x]++;
            ke[y]++;
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(ke[i] > 1) cnt++;
        }
        System.out.println(cnt > 1 ? "No" : "Yes");
    }
}
//5
//1 2
//1 3
//1 4
//1 5