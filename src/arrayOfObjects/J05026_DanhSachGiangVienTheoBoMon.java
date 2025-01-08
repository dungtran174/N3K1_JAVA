package arrayOfObjects;

import java.util.*;

public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GV1> gv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            gv.add(new GV1(String.format("GV%02d", gv.size() + 1), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String sj = new GV1(sc.nextLine()).sj;
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:%n", sj);
            for (GV1 i : gv) {
                if (i.sj.equals(sj))
                    System.out.println(i);
            }
        }
        // list.forEach(System.out::println);
        sc.close();
    }
}

class GV1 {
    String code, name, sj, lastName;

    public GV1(String code, String name, String sj) {
        this.name = name;
        this.code = code;
        setSubject(sj.split("\\s+"));
        setLastName(name.split("\\s+"));
    }

    public GV1(String sj) {
        setSubject(sj.split("\\s+"));
    }

    public void setSubject(String[] list) {
        StringBuilder sj = new StringBuilder();
        for (String i : list)
            sj.append(Character.toUpperCase(i.charAt(0)));
        this.sj = sj.toString();
    }

    public void setLastName(String[] name) {
        this.lastName = name[name.length - 1];
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.sj;
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem