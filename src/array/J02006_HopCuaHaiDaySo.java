package array;

import java.util.Scanner;

public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), x;
        int b = sc.nextInt();
        int[] n = new int[1001];
        for (int i = 0; i < a; i++) {
            x = sc.nextInt();
            n[x] = 1;
        }
        for (int i = 0; i < b; i++) {
            x = sc.nextInt();
            n[x] = 1;
        }
        for (int i = 0; i < 1001; i++) {
            if (n[i] == 1) {
                System.out.printf("%d ", i);
            }
        }
    }
}
