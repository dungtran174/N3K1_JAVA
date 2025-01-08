package contest;

import java.util.*;
import java.io.*;

public class Bai55_GhepMa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a = (ArrayList<String>) in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeSet<String> ts = new TreeSet<>();
        for (String x : a) {
            for (int y : b) {
                String tmp = x + (y + "");
                ts.add(tmp);
            }
        }
        for (String x : ts) System.out.println(x);
    }
}
/*
DATA1.in
Có một ArrayList<String>, ví dụ viết ở dạng ký tự có thể là:
AAAAA
BBBBB
DATA2.in
Có một ArrayList<Integer>, ví dụ viết ở dạng ký tự có thể là:
111
222

Danh sách các mã, ví dụ:
AAAAA11
AAAAA222
BBBBB111
BBBBB222
 */