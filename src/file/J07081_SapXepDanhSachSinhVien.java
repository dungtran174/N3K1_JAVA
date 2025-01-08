package file;
import java.util.*;
import java.io.*;

public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        list.sort((a, b) -> {
            if (a.firstName.compareTo(b.firstName) != 0)
                return a.firstName.compareTo(b.firstName);
            if (a.lastName.compareTo(b.lastName) != 0)
                return a.lastName.compareTo(b.lastName);
            if (a.midName.compareTo(b.midName) != 0)
                return a.midName.compareTo(b.midName);
            return a.id.compareTo(b.id);
        });
        list.forEach(System.out::println);
    }
}

class Student {
     String id, phone, email, firstName, midName, lastName, name;

    public Student(String id, String name, String phone, String email) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.name = name;
        String[] s = name.split("\\s+");
        this.firstName = s[s.length - 1];
        this.lastName = s[0];
        this.midName = String.join(" ", Arrays.copyOfRange(s, 1, s.length - 1));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email;
    }
}
