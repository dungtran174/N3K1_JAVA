package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> dd = new ArrayList<>();
        while(t-- > 0) {
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder s = new StringBuilder(arr[arr.length - 1]);
            for(int i = 0; i < arr.length - 1; i++) {
                s.append(arr[i].charAt(0));
            }
            dd.add(s.toString());
            int count = Collections.frequency(dd, s.toString());
            s.append(count == 1 ? "" : count).append("@ptit.edu.vn");
            System.out.println(s);
        }
    }
}
