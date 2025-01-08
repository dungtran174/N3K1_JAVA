package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class DN {
    String ma, ten;
    int sl;

    public DN(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DN> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++) {
            list.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        list.sort(Comparator.comparing(a -> a.ma));
        list.forEach(System.out::println);
    }
}
