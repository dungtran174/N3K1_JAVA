package array;

import java.util.*;

public class J02025_DayConCoTongNguyenTo {

    static int[] a = new int[0];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            Try(n - 1, 0, "");  // Gọi hàm đệ quy để tìm các tập con
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void Try(int i, int sum, String list) {
        if (i < 0) {
            if (isPrime(sum)) {  // Nếu tổng là số nguyên tố
                System.out.println(list.trim());  // In ra chuỗi kết quả
            }
            return;
        }
        // Không chọn phần tử a[i]
        Try(i - 1, sum, list);

        // Chọn phần tử a[i]
        Try(i - 1, sum + a[i], list + a[i] + " ");
    }
}
