package array;

import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[205];
        int math = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            d[x] = 1;
            math = Math.max(math, x);
        }
        boolean ex = true;
        for(int i = 1; i <= math; i++) {
            if(d[i] == 0) {
                System.out.println(i);
                ex = false;
            }
        }
        if(ex) {
            System.out.println("Excellent!");
        }
    }
}
