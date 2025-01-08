package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV2> sv = new ArrayList<>();
        while (sc.hasNextLine()) {
            sv.add(new SV2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sv.sort((a, b) -> a.code.compareTo(b.code));
        sv.forEach(System.out::println);
        sc.close();
    }
}
class SV2 {
    String code, name, gr, email;

    public SV2(String code, String name, String gr, String email) {
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
//D15CQKT03-B
//sv4@stu.ptit.edu.vn