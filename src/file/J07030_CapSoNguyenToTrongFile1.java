package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0 && n > 2) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) o.readObject();
        o = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) o.readObject();
        int[] m = new int[1000005];
        int[] n = new int[1000005];
        Arrays.fill(m, 0);
        Arrays.fill(n, 0);
        a.forEach(e -> m[e]++);
        b.forEach(e -> n[e]++);
        for (int i = 0; i < 1000000 / 2; i++) {
            if (m[i] > 0 && n[1000000 - i] > 0 && prime(i) && prime(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}

