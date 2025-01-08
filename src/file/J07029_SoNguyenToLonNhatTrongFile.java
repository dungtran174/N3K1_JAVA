package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class J07029_SoNguyenToLonNhatTrongFile {
    static int[] p = new int[(int) 1e6 + 5];

    public static void sang() {
        Arrays.fill(p, 0);
        p[0] = p[1] = 1;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (p[i] == 0) {
                for (int j = i * i; j <= 1000000; j += i) {
                    p[j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sang();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        int[] m = new int[(int) 1e6 + 5];
        Arrays.fill(m, 0);
        a.forEach(e -> m[e]++);
        int cnt = 0;
        for (int i = 1000000; i >=0; i--) {
            if (m[i] > 0 && p[i] == 0) {
                System.out.println(i + " " + m[i]);
                cnt++;
            }
            if (cnt == 10) break;
        }
    }
}
