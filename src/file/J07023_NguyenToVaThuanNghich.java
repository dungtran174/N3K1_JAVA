package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class J07023_NguyenToVaThuanNghich {
    public static boolean tn(Integer n) {
        String s1 = n.toString();
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }
    public static boolean prime(int n) {
        if (n < 2)
            return false;
        if (n % 2 == 0 && n > 2)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> data1 = (ArrayList<Integer>) o.readObject();
        int[] m1 = new int[10005];
        Arrays.fill(m1, 0);
        data1.forEach(e -> m1[e]++);

        o = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> data2 = (ArrayList<Integer>) o.readObject();
        int[] m2 = new int[10005];
        Arrays.fill(m2, 0);
        data2.forEach(e -> m2[e]++);

        for (int i = 0; i < 10000; i++) {
            if (m1[i] > 0 && m2[i] > 0 && prime(i) && tn(i)) {
                System.out.println(i + " " + m1[i] + " " + m2[i]);
            }
        }
    }
}
