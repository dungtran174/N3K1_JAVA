package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV3> sv = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sv.add(new SV3(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String gr = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", gr);
            for (SV3 i : sv) {
                if (i.gr.equals(gr))
                    System.out.println(i);
            }
        }
    }
}
class SV3 {
    String code, name, gr, email;

    public SV3(String code, String name, String gr, String email) {
        this.code = code;
        this.name = name;
        this.gr = gr;
        this.email = email;
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
//D15CQKT02-B