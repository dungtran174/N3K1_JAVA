package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    String ten, lop, ns, msv;
    Double gpa;

    public SinhVien(int x, String ten, String lop, String ns, Double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ns = chuanHoa(ns);
        this.msv = "B20DCCN" + String.format("%03d", x);
        this.gpa = gpa;
    }

    String chuanHoa(String s) {
        if (s.charAt(1) == '/') s = "0" + s;
        if (s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class J07010_DanhSachSinhVienTrongFile2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            list.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        list.forEach(System.out::println);
    }
}
