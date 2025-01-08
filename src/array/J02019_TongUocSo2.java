package array;

import java.util.Scanner;

public class J02019_TongUocSo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MAX = 1000000;
        // Mảng lưu tổng các ước của mỗi số từ 1 đến MAX
        int[] sumDiv = new int[MAX + 1];
        // Tính tổng các ước cho tất cả các số từ 1 đến MAX
        for (int i = 1; i <= MAX; i++) {
            for (int j = 2 * i; j <= MAX; j += i) {
                sumDiv[j] += i;
            }
        }
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (sumDiv[i] > i) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
