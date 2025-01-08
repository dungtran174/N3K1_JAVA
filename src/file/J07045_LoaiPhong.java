package file;

import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    String ma, ten;

    public LoaiPhong(String ma) {
        this.ten = ma.trim().split("\\s+")[1];
        this.ma = ma;
    }

    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma;
    }

}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
