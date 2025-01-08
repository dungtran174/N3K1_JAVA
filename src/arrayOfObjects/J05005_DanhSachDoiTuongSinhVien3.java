package arrayOfObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class J05005_DanhSachDoiTuongSinhVien3 {
    static public String nameFormat(String name) {
        String[] s = name.toLowerCase().trim().split("\\s+");
        for(int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }
        return String.join(" ", s);
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student3> st = new ArrayList<>();
        for(int i = 1; i <= t; i++) {
            st.add(new Student3(i, nameFormat(sc.nextLine()), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        st.sort((a, b) -> a.getGpa() < b.getGpa() ? 1 : -1);
        st.forEach(System.out::println);
        sc.close();
    }
}
class Student3 {
    String id, name, className, dob;
    Double gpa;

    public Student3(int index, String name, String className, String dob, Double gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", index);
        this.name = name;
        this.className = className;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(dob));
        this.gpa = gpa;
    }

    public Double getGpa() {
        return this.gpa;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + " " + String.format("%.2f", gpa);
    }
}

//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
