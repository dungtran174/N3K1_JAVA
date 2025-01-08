package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class MH {
    String ma, ten;
    int tc;

    public MH(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tc;
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MH> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++) {
            list.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        list.sort(Comparator.comparing(a -> a.ten));
        list.forEach(System.out::println);
    }
}
