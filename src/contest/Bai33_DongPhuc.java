package contest;

import java.io.*;
import java.util.*;

class Student11 implements Comparable<Student11> {
    private String msv, ten, lop, email, sdt, gioiTinh, sizeAo;

    public Student11(String msv, String ten, String lop, String email, String std, String gioiTinh) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = std;
        this.gioiTinh = gioiTinh;
    }

    public void setSizeAo(String sizeAo) {
        this.sizeAo = sizeAo;
    }

    public String getSizeAo() {
        return sizeAo;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.msv, this.ten, this.lop, this.email, this.sdt);
    }

    @Override
    public int compareTo(Student11 o) {
        return this.msv.compareTo(o.msv);
    }

}

public class Bai33_DongPhuc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student11> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(new Student11(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        sc = new Scanner(new File("DANGKY.in"));
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] tmp1 = s.trim().split("\\s+");
            a.get(i).setSizeAo(tmp1[1]);
        }
        sc = new Scanner(new File("TRUYVAN.in"));
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            String[] tmp1 = s.trim().split("\\s+");
            String gioi = tmp1[0].toUpperCase(), sizeAo = tmp1[1];
            System.out.println(String.format("DANH SACH SINH VIEN %s DANG KY SIZE %s", gioi, sizeAo));
            for (Student11 x : a) {
                if (x.getSizeAo().equals(sizeAo) && x.getGioiTinh().toUpperCase().equals(gioi)) System.out.println(x);
            }
        }
    }
}
/*
SINHVIEN.in
2
B21DCCN111
Hoang Van An
D21CQCN01-B
hoangvanan@gmail.com
0912999888
Nam
B21DCAT999
Tran Van Binh
D21CQAT01-B
chinh31503@gmail.com
838831503
Nam
DANGKY.in
B21DCCN111 L
B21DCAT999 XL
TRUYVAN.in
1
Nam L

Output
DANH SACH SINH VIEN NAM DANG KY SIZE L
B21DCCN111 Hoang Van An D21CQCN01-B hoangvanan@gmail.com 0912999888
 */