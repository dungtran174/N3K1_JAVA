package javaCollection;

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        while (t-- > 0) {
            String s = input.nextLine();
            String[] words = s.split("\\s+");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + (i > 0 ? " " : ""));
            }
            System.out.println();
        }
        input.close();
    }
}
