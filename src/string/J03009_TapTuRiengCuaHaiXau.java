package string;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Di chuyển con trỏ tới dòng mới sau khi đọc số nguyên

        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a1 = s1.split("\\s+");
            String[] a2 = s2.split("\\s+");

            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();

            Collections.addAll(set1, a1);
            Collections.addAll(set2, a2);

            for (String x : set1) {
                if (!set2.contains(x)) { // Kiểm tra trực tiếp bằng contains()
                    System.out.print(x + " "); // In ra các từ không có trong set2
                }
            }
            System.out.println(); // Xuống dòng sau khi in hết các từ riêng
        }
    }
}

//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc
