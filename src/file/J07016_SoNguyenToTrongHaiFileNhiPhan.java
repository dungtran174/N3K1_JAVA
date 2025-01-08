package file;

import java.util.*;
import java.io.*;

public class J07016_SoNguyenToTrongHaiFileNhiPhan {
    public static boolean isPrime(int n) {
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

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o.readObject();
        int[] map1 = new int[10005];
        Arrays.fill(map1, 0);
        list1.forEach(e -> map1[e]++);

        ObjectInputStream h = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) h.readObject();
        int[] map2 = new int[10005];
        Arrays.fill(map2, 0);
        list2.forEach(e -> map2[e]++);


        for (int i = 0; i <= 10000; i++)
            if (map1[i] > 0 && map2[i] > 0 && isPrime(i)) {
                System.out.println(i + " " + map1[i] + " " + map2[i]);
            }

    }
}