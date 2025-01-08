package contest;

import java.util.*;

public class Bai5_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
//2
//I like this program very much,
//much very program this like I