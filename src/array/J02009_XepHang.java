package array;

import java.util.Arrays;
import java.util.Scanner;

public class J02009_XepHang {
    // Lớp Pair để lưu trữ thời gian đến và thời gian check-in
    static class Pair implements Comparable<Pair> {
        int arrivalTime;
        int checkInTime;

        Pair(int arrivalTime, int checkInTime) {
            this.arrivalTime = arrivalTime;
            this.checkInTime = checkInTime;
        }

        // So sánh theo thời gian đến (arrivalTime)
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.arrivalTime, other.arrivalTime);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Pair[] customers = new Pair[N];

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();  // thời điểm khách đến
            int D = sc.nextInt();  // thời gian khách cần để check-in
            customers[i] = new Pair(T, D);
        }

        // Sắp xếp các khách hàng theo thời gian đến
        Arrays.sort(customers);

        int current_time = 0;
        for (int i = 0; i < N; i++) {
            if (customers[i].arrivalTime > current_time) {
                current_time = customers[i].arrivalTime;
            }
            current_time += customers[i].checkInTime;
        }

        System.out.println(current_time);
    }
}
