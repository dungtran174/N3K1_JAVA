package string;

import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                StringBuilder h = new StringBuilder(word);
                result.append(h.reverse()).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
//2
//ABC DEF
//123 456