package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(i + " " + map.get(i));
        }
        sc.close();
    }
}
