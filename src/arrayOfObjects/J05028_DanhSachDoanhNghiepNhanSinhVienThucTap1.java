package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DN> dn = new ArrayList<>();
        while (t-- > 0) {
            dn.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        dn.sort((a, b) -> a.slot != b.slot ? (a.slot < b.slot ? 1 : -1) : (a.id.compareTo(b.id)));
        dn.forEach(System.out::println);
        sc.close();
    }
}
class DN {
    String id, name;
    int slot;

    public DN(String id, String name, int slot) {
        this.id = id;
        this.name = name;
        this.slot = slot;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + slot;
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50