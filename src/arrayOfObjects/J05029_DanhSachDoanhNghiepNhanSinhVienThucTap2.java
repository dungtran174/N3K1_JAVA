package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DN1> dn = new ArrayList<>();
        while (t-- > 0) {
            dn.add(new DN1(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        dn.sort((a, b) -> a.slot != b.slot ? (a.slot < b.slot ? 1 : -1) : (a.id.compareTo(b.id)));
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for(DN1 i : dn) {
                if(i.slot >= a && i.slot <= b) {
                    System.out.println(i);
                }
                else if (i.slot < a)
                    break;
            }
        }
        sc.close();
    }
}
class DN1 {
    String id, name;
    int slot;

    public DN1(String id, String name, int slot) {
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
//1
//30 50