package array;

import java.util.Scanner;

public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        // Kiểm tra các trường hợp không thể tạo số
        if (S == 0 || S > 9 * N) {
            System.out.println("-1 -1");
            return;
        }
        // Tìm số lớn nhất
        StringBuilder largest = new StringBuilder();
        int sum = S;
        for (int i = 0; i < N; i++) {
            if (sum >= 9) {
                largest.append('9');
                sum -= 9;
            } else {
                largest.append(sum);
                sum = 0;
            }
        }
        // Tìm số nhỏ nhất
        StringBuilder smallest = new StringBuilder();
        sum = S;
        for (int i = 0; i < N; i++) {
            int digit;
            if (i == 0) {
                digit = Math.max(1, sum - 9 * (N - 1 - i));
            } else {
                digit = Math.max(0, sum - 9 * (N - 1 - i));
            }
            smallest.append(digit);
            sum -= digit;
        }
        System.out.println(smallest + " " + largest);
    }
}

