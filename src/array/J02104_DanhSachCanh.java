package array;

import java.util.Scanner;

public class J02104_DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (i < j && x == 1) {
                    System.out.printf("(%d,%d)\n", i, j);
                }
            }
        }
    }
}
