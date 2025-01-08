package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < a.size() - 1; i++) {
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i);
                    a.remove(i); // xóa phần tử tiếp theo, phần tử này đã được dời đến vị trí `i`
                    found = true;
                    break;// bắt đầu lại vòng lặp từ while
                }
            }
        }
        System.out.println(a.size());
    }
}
