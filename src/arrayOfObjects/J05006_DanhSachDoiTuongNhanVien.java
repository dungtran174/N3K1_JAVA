package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> nv = new ArrayList<>();
        for(int i = 1; i <= t; i++) {
            nv.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        nv.forEach(System.out::println);
        sc.close();
    }
}
class NhanVien {
    String id, name, gender, dob, address, tax, sginDate;

    public NhanVien(int i, String name, String gender, String dob, String address, String tax, String sginDate) {
        this.id = String.format("%05d", i);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.sginDate = sginDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + tax  + " " + sginDate;
    }
}