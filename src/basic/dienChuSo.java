package basic;

import java.util.Scanner;

public class dienChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Đọc số lượng bộ test
        scanner.nextLine(); // Đọc dòng trống sau số lượng bộ test

        while (T-- > 0) {
            String A = scanner.nextLine().trim();
            String B = scanner.nextLine().trim();
            System.out.println(countNumbersGreaterThanB(A, B));
        }
    }

    // Hàm đệ quy để đếm số lượng số tạo được từ A lớn hơn B
    static int countNumbersGreaterThanB(String A, String B) {
        return countRecursive(A, B, 0);
    }

    // Hàm đệ quy
    static int countRecursive(String A, String B, int index) {
        if (index == A.length()) {
            // Khi đã điền hết các vị trí ?, so sánh số A với B
            return A.compareTo(B) > 0 ? 1 : 0;
        }

        // Nếu vị trí hiện tại là dấu ?
        if (A.charAt(index) == '?') {
            int count = 0;
            for (char c = '0'; c <= '9'; c++) {
                // Không cho phép số bắt đầu với 0 (ngoại trừ khi tất cả là số 0)
                if (index == 0 && c == '0') continue;
                count += countRecursive(A.substring(0, index) + c + A.substring(index + 1), B, index + 1);
            }
            return count;
        } else {
            // Nếu vị trí hiện tại không phải là dấu ?, tiếp tục kiểm tra vị trí tiếp theo
            return countRecursive(A, B, index + 1);
        }
    }
}
