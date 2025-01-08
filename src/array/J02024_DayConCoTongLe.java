package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02024_DayConCoTongLe {
    static int[] a = new int[0];
    static int n;
    static ArrayList<String> set;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            set = new ArrayList<>();
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            Try(n - 1, 0, "");
        }
        sc.close();
    }

    public static void Try(int i, int sum, String list) {
        if (i < 0) {
            if (sum % 2 == 1)
                System.out.println(list.trim());
            return;
        }

        // Không chọn phần tử a[i]
        Try(i - 1, sum, list);

        // Chọn phần tử a[i]
        Try(i - 1, sum + a[i], list + a[i] + " ");
    }
}
