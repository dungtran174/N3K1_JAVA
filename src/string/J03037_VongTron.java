package string;

import java.util.*;

public class J03037_VongTron {
    // Hàm kiểm tra giao điểm giữa 2 cặp ký tự
    private static boolean isIntersecting(List<Integer> p1, List<Integer> p2) {
        int a = p1.get(0), b = p1.get(1);
        int c = p2.get(0), d = p2.get(1);
        return (a < c && c < b && b < d) || (c < a && a < d && d < b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Đọc chuỗi đầu vào (52 ký tự)
        int n = s.length();

        // Lưu vị trí của mỗi ký tự
        Map<Character, List<Integer>> positions = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            positions.putIfAbsent(c, new ArrayList<>());
            positions.get(c).add(i);
        }
        int count = 0;
        // Duyệt qua tất cả các cặp ký tự

        for (char c1 : positions.keySet()) {
            List<Integer> pos1 = positions.get(c1);
            for (char c2 : positions.keySet()) {
                if (c1 == c2) continue; // Bỏ qua ký tự giống nhau
                List<Integer> pos2 = positions.get(c2);
                // Kiểm tra giao điểm giữa cặp ký tự
                if (isIntersecting(pos1, pos2)) {
                    count++;
                }
            }
        }

        System.out.println(count / 2);
    }
}
//ABCCABDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYYZZ
