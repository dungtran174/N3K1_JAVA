package array;

import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}
