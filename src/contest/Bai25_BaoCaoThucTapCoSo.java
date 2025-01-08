package contest;

import java.util.*;
import java.io.*;

class Sinh_vien {
    private String msv, ten, sdt, mail;

    public Sinh_vien(String msv, String ten, String sdt, String mail) {
        this.msv = msv.trim();
        this.ten = ten.trim();
        this.sdt = sdt.trim();
        this.mail = mail.trim();
    }

    public String getMsv() {
        return this.msv;
    }

    public String getTen() {
        return this.ten;
    }
}

class Detai {
    private String gv, detai, madetai;

    public Detai(int x, String gv, String detai) {
        this.madetai = String.format("DT%03d", x);
        this.gv = gv.trim();
        this.detai = detai.trim();
    }

    public String getGv() {
        return gv;
    }

    public String getDetai() {
        return detai;
    }

    public String getMadetai() {
        return madetai;
    }
}

class HoiDong implements Comparable<HoiDong> {
    private String msv, madetai, mahd;

    public HoiDong(String msv, String madetai, String mahd) {
        this.msv = msv.trim();
        this.madetai = madetai.trim();
        this.mahd = mahd.trim();
    }

    public String getMsv() {
        return msv;
    }

    public String getMadetai() {
        return madetai;
    }

    public String getMahd() {
        return mahd;
    }

    @Override
    public int compareTo(HoiDong t) {
        return this.msv.compareTo(t.msv);
    }
}

public class Bai25_BaoCaoThucTapCoSo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, String> mp1 = new HashMap<>();//key là msv, val là tên
        int n = sc.nextInt();
        Sinh_vien[] a = new Sinh_vien[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp1.put(a[i].getMsv(), a[i].getTen());
        }
        sc = new Scanner(new File("DETAI.in"));
        int p = sc.nextInt();
        sc.nextLine();
        Detai[] b = new Detai[p];
        HashMap<String, String> mp2 = new HashMap<>();//key là mã đề tài, val là tên detai + tên gv
        for (int i = 0; i < p; i++) {
            b[i] = new Detai(i + 1, sc.nextLine(), sc.nextLine());
            mp2.put(b[i].getMadetai(), b[i].getDetai() + " " + b[i].getGv());
        }
        sc = new Scanner(new File("HOIDONG.in"));
        int m = sc.nextInt();
        sc.nextLine();
        HoiDong[] c = new HoiDong[m];
        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            c[i] = new HoiDong(tmp[0], tmp[1], tmp[2]);
            ts.add(tmp[2]);
        }
        Arrays.sort(c);
        for (String s : ts) {
            System.out.println("DANH SACH HOI DONG " + s.charAt(2) + ":");
            for (HoiDong x : c) {
                if (x.getMahd().equals(s))
                    System.out.println(x.getMsv() + " " + mp1.get(x.getMsv()) + " " + mp2.get(x.getMadetai()));
            }
        }
    }
}
/*
SINHVIEN.in
2
B19DCCN999
Ngo Quang Huy
0976544443
B19DCCN999@stu.ptit.edu.vn
B17DCCN997
Nguyen Manh Cuong
0987654321
B19DCCN997@stu.ptit.edu.vn
DETAI.in
3
Nguyen Hoai Nam
Xay dung website tim kiem nha thong minh
Tran Thanh Cong
Xay dung he thong diem danh bang nhan dang van tay
Le Thi My Uyen
Xay dung website cap nhat tin tuc
HOIDONG.in
2
B19DCCN997 DT001 HD2
B19DCCN999 DT002 HD1

DANH SACH HOI DONG 1:
B19DCCN999 Ngo Quang Huy Xay dung he thong diem danh bang nhan dang van tay Tran Thanh Cong
DANH SACH HOI DONG 2:
B19DCCN997 Nguyen Manh Cuong Xay dung website tim kiem nha thong minh Nguyen Hoai Nam
 */