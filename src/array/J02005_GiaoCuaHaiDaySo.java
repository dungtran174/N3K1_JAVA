package array;

import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), x;
        int b = sc.nextInt();
        int[] n = new int[1001];
        int[] m = new int[1001];
        for (int i = 0; i < a; i++) {
            x = sc.nextInt();
            n[x] = 1;
        }
        for (int i = 0; i < b; i++) {
            x = sc.nextInt();
            m[x] = 1;
        }
        for (int i = 0; i < 1001; i++) {
            if (m[i] == 1 && n[i] == 1) {
                System.out.printf("%d ", i);
            }
        }
    }
}
