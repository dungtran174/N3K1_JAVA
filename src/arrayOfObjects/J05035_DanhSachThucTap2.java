package arrayOfObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05035_DanhSachThucTap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student5> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            list.add(new Student5(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine()));
        }
        list.sort(Comparator.comparing(a -> a.id));
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String company = sc.nextLine();
            for (int i = 0; i < t; i++) {
                if (company.equals(list.get(i).company)) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}

class Student5 {
    String id, name, className, email, company;
    int ordinals;

    public Student5(int ordinals, String id, String name, String className, String email, String company) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
        this.ordinals = ordinals;
    }

    @Override
    public String toString() {
        return ordinals + " " + id + " " + name + " " + className + " " + email +
                " " + company;
    }
}
//6
//B17DCCN016
//Le Khac Tuan Anh
//D17HTTT2
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107
//Dao Thanh Dat
//D17CNPM5
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092
//Cao Danh Huy
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388
//Cao Sy Hai Long
//D17CNPM2
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461
//Dinh Quang Nghia
//D17CNPM2
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554
//Bui Xuan Thai
//D17CNPM1
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT