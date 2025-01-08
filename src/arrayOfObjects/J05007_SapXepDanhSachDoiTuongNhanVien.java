package arrayOfObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien2> nv = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            nv.add(new NhanVien2(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        nv.sort((a, b) -> a.dob.compareTo(b.dob));
        for (NhanVien2 i : nv)
            System.out.println(i);
        sc.close();
    }
}

class NhanVien2 {
    String id, name, gender, address, tax, signDate;
    Date dob;
    public NhanVien2(int i, String name, String gender, String dob, String address, String tax, String signDate) throws ParseException {
        this.id = String.format("%05d", i);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
        this.tax = tax;
        this.signDate = signDate;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob)
                + " " + address + " " + tax + " " + signDate;
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011