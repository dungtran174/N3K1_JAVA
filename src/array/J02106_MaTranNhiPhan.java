package array;
import java.util.Scanner;
public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while (n-- > 0) {
            int x = 0;
            for (int i = 0; i < 3; i++) {
                int k = sc.nextInt();
                if (k == 1)
                    x++;
            }
            if (x >= 2)
                s++;
        }
        System.out.print(s);
    }
}
