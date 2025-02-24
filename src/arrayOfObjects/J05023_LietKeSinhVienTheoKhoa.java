package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV4> sv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sv.add(new SV4(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String sYear = sc.nextLine().substring(2);
            System.out.printf("DANH SACH SINH VIEN KHOA 20%s:\n", sYear);
            for (SV4 i : sv) {
                if (i.sYear.equals(sYear))
                    System.out.println(i);
            }
        }
    }
}

class SV4 {
    String code, name, gr, email, sYear;

    public SV4(String code, String name, String gr, String email) {
        this.code = code;
        this.name = name;
        this.gr = gr;
        this.email = email;
        this.sYear = gr.substring(1, 3);
    }

    @Override
    public String toString() {
        return code + " " + name + " " + gr + " " + email;
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015