package contest;

import java.util.*;
import java.io.*;

class Sinhvien1 implements Comparable<Sinhvien1> {
    private String msv, ten, lop, mail, sdt;

    public Sinhvien1(String msv, String ten, String lop, String mail, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    @Override
    public int compareTo(Sinhvien1 t) {
        if (!this.lop.equals(t.lop)) return this.lop.compareTo(t.lop);
        return this.msv.compareTo(t.msv);
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.mail + " " + this.sdt;
    }
}

public class Bai21_DanhSachLienLac {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Sinhvien1> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(new Sinhvien1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (Sinhvien1 x : a) System.out.println(x);
    }
}
/*
B21DCCN123
Tran Van Toan
D21CQCN01-B
toantv@gmail.com
987654321
B21DCCN111
Ly Van Binh
D21CQCN01-B
binhlv@gmail.com
978652142
B21DCAT661
Hoang Tam Anh
D21CQAT01-B
anhht@gmail.com
966554321

B21DCAT661 Hoang Tam Anh D21CQAT01-B anhht@gmail.com 096655432
B21DCCN111 Ly Van Binh D21CQCN01-B binhlv@gmail.com 0978652142
B21DCCN123 Tran Van Toan D21CQCN01-B toantv@gmail.com 0987654321
 */