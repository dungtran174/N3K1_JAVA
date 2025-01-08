package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.valueOf(s);
            } catch (NumberFormatException e) {
                a.add(s);
            }
        }
        a.sort((a1, b) -> a1.compareTo(b));
        a.forEach(e -> System.out.print(e + " "));
    }
}
