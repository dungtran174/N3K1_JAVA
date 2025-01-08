package array;

import java.util.Scanner;

public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (x == 1)
                    System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
