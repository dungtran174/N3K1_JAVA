package class_objects;

import java.util.Scanner;

class Staff {
    private String msv, name, sex, dob, address, tax, date;

    public Staff() {
        this("00001", "", "", "", "", "", "");
    }

    public Staff(String msv, String name, String sex, String dob, String address, String tax, String date) {
        this.msv = msv;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + sex + " " + dob + " " + address + " " + tax
                + " " + date;
    }
}

public class J04007_KhaiBaoNhanVien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        Staff sta = new Staff("00001", name, sex, dob, address, tax, date);
        System.out.println(sta);
    }
}
