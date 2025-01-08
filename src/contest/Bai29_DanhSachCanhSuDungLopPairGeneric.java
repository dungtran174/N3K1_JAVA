package contest;

import java.util.*;

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}

public class Bai29_DanhSachCanhSuDungLopPairGeneric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Pair<Integer, Integer>> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1 && i < j) b.add(new Pair<>(i + 1, j + 1));
            }
        }
        for (Pair x : b) System.out.println(x);
    }
}
/*
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0

(1,2)
(1,3)
(1,5)
(2,3)
(2,5)
(3,4)
(4,5)
(4,6)
(5,6)
 */