package arrayOfObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV5> sv = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sv.add(new SV5(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Ke toan", "DCKT");
        hm.put("Cong nghe thong tin", "DCCN");
        hm.put("An toan thong tin", "DCAT");
        hm.put("Vien thong", "DCVT");
        hm.put("Dien tu", "DCDT");
        while (q-- > 0) {
            String key = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", key.toUpperCase());
            for(SV5 i : sv) {
                if (key.equals("Cong nghe thong tin") || key.equals("An toan thong tin")) {
                    if (i.gr.charAt(0) != 'E' && i.code.contains(hm.get(key)))
                        System.out.println(i);
                } else if (i.code.contains(hm.get(key)))
                    System.out.println(i);
            }
        }
    }
}
class SV5 {
    String code, name, gr, email;

    public SV5(String code, String name, String gr, String email) {
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
//Ke toan