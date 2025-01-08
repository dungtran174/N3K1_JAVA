package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new GV(String.format("GV%02d", list.size() + 1), sc.nextLine(), sc.nextLine()));
        list.sort((a, b) -> a.lastName.compareTo(b.lastName) == 0 ? a.code.compareTo(b.code) : a.lastName.compareTo(b.lastName));
        list.forEach(System.out::println);
        sc.close();
    }
}

class GV {
    String code, name, sj, lastName;

    public GV(String code, String name, String sj) {
        this.code = code;
        this.name = name;
        setSubject(sj.split("\\s+"));
        setLastName(name.split("\\s+"));
    }

    public void setSubject(String[] list) {
        String sj = "";
        for (String i : list) {
            sj += Character.toUpperCase(i.charAt(0));
        }
        this.sj = sj;
    }

    public void setLastName(String[] name) {
        this.lastName = name[name.length - 1];
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