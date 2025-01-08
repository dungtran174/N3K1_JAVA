package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027_TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV2> gv = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            gv.add(new GV2(String.format("GV%02d", gv.size() + 1), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- >0) {
            String key = sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:%n", key);
            for(GV2 i : gv) {
                if(i.name.toLowerCase().contains(key.toLowerCase())) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
class GV2 {
    String code, name, sj;

    public GV2(String code, String name, String sj) {
        this.code = code;
        this.name = name;
        setSubject(sj.split("\\s+"));
    }
    public void setSubject(String[] list) {
        StringBuilder sj = new StringBuilder();
        for (String i : list) {
            sj.append(Character.toUpperCase(i.charAt(0)));
        }
        this.sj = sj.toString();
    }

    @Override
    public String toString() {
        return code + " " + name + " " + sj;
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
//aN