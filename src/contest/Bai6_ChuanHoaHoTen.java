package contest;

import java.util.Scanner;

public class Bai6_ChuanHoaHoTen {
    public static String chuanhoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    // Hàm chuẩn hóa tên theo cách 1 (Tên có 1 từ đứng đầu)
    public static String cach1(String[] a) {
        StringBuilder result = new StringBuilder();
        result.append(chuanhoa(a[a.length - 1])); // Lấy từ cuối (Tên)
        for (int i = 0; i < a.length - 1; i++) {
            result.append(" ").append(chuanhoa(a[i])); // Ghép họ và đệm
        }
        return result.toString();
    }
    // Hàm chuẩn hóa tên theo cách 2 (Họ có 1 từ đứng cuối)
    public static String cach2(String[] a) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            result.append(chuanhoa(a[i])).append(" "); // Ghép đệm và tên
        }
        result.append(chuanhoa(a[0])); // Cuối cùng ghép họ
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim()); // Số bộ test

        while (t-- > 0) {
            int method = Integer.parseInt(sc.nextLine().trim()); // Phương pháp chuẩn hóa
            String s = sc.nextLine().trim(); // Đọc xâu họ tên
            String[] a = s.split("\\s+"); // Loại bỏ khoảng trắng thừa và tách thành mảng từ

            if (method == 1) {
                System.out.println(cach1(a)); // Chuẩn hóa theo cách 1
            } else if (method == 2) {
                System.out.println(cach2(a)); // Chuẩn hóa theo cách 2
            }
        }
        sc.close();
    }
}


//2
//1
//NguyeN    vAn    Nam
//2
//hoAng  le Nhat THONG chi