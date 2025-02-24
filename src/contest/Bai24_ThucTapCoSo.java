package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bai24_ThucTapCoSo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int nSV = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < nSV; i++)
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        sc = new Scanner(new File("DETAI.in"));
        int nDT = Integer.parseInt(sc.nextLine());
        ArrayList<DeTai> dt = new ArrayList<>();
        for (int i = 0; i < nDT; i++)
            dt.add(new DeTai(i + 1, sc.nextLine(), sc.nextLine()));

        sc = new Scanner(new File("NHIEMVU.in"));
        int nNV = Integer.parseInt(sc.nextLine());
        ArrayList<NhiemVu> nv = new ArrayList<>();
        for (int i = 0; i < nNV; i++) {
            String[] inp = sc.nextLine().split(" ");
            String msv = inp[0];
            int iMsv = 0;
            for (int j = 0; j < sv.size(); j++)
                if (msv.equals(sv.get(j).getId())) iMsv = j;
            String maDeTai = inp[1];
            int iDeTai = 0;
            for (int j = 0; j < dt.size(); j++)
                if (maDeTai.equals(dt.get(j).getId())) iDeTai = j;

            nv.add(new NhiemVu(sv.get(iMsv), dt.get(iDeTai)));
        }
        Collections.sort(nv);
        nv.forEach(System.out::println);
    }
}

class SinhVien {
    String id, name, phone, email;

    public SinhVien(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

}

class DeTai {
    int id;
    String gv, deTai;

    public DeTai(int id, String gv, String deTai) {
        this.id = id;
        this.gv = gv;
        this.deTai = deTai;
    }

    public String getId() {
        return String.format("DT%03d", id);
    }


    @Override
    public String toString() {
        return getId() + " " + gv + " " + deTai;
    }
}

class NhiemVu implements Comparable<NhiemVu> {
    SinhVien sv;
    DeTai dt;

    public NhiemVu(SinhVien sv, DeTai dt) {
        this.sv = sv;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return sv.id + " " + " " + sv.name + " " + sv.phone + " " + sv.email + " " + dt.gv + " " + dt.deTai;
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.dt.deTai.compareTo(o.dt.deTai);
    }
}
/*
SINHVIEN.in
2
B19DCCN999
Ngo Quang Huy
0976544443
B19DCCN999@stu.ptit.edu.vn
B19DCCN997
Nguyen Manh Cuong
0987654321
B19DCCN997@stu.ptit.edu.v
DETAI.in
3
Nguyen Hoai Nam
Xay dung website tim kiem nha thong minh
Tran Thanh Cong
Xay dung he thong diem danh bang nhan dang van tay
Le Thi My Uyen
Xay dung website cap nhat tin tu
NHIEMVU.in
2
B19DCCN997 DT001
B19DCCN999 DT002

B19DCCN999 Ngo Quang Huy 0976544443 B19DCCN999@stu.ptit.edu.vn
Tran Thanh Cong Xay dung he thong diem danh bang nhan dang van tay
B19DCCN997 Nguyen Manh Cuong 0987654321 B19DCCN997@stu.ptit.edu.vn
Nguyen Hoai Nam Xay dung website tim kiem nha thong minh
 */
