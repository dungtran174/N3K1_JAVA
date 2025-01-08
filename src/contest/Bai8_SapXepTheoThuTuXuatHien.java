package contest;

import java.util.*;

public class Bai8_SapXepTheoThuTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freqMap = new LinkedHashMap<>(); // LinkedHashMap để lưu tần suất và giữ thứ tự xuất hiện
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
            }
            // Tạo danh sách các phần tử từ freqMap
            List<Integer> list = new ArrayList<>(freqMap.keySet());
            list.sort((o1, o2) -> {
                int freq1 = freqMap.get(o1);
                int freq2 = freqMap.get(o2);
                if (freq1 != freq2) {
                    return freq2 - freq1; // Sắp giảm dần theo tần suất
                } else {
                    return 0; // Giữ nguyên thứ tự xuất hiện
                }
            });

            for (int num : list) {
                for (int i = 0; i < freqMap.get(num); i++) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


//2
//8
//2 5 2 8 5 6 8 8
//10
//2 5 2 6 -1 9999999 5 8 8 8