package basic;
import java.util.*;
public class soNguyenTo {
    public static boolean nto(int n) {
        if(n < 2) return false;
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(nto(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
