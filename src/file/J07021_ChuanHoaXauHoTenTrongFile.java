package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static String chuanHoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.equals("END")) break;
            String[] b = s.trim().split("\\s+");
            for(String x : b){
                System.out.print(chuanHoa(x) + " ");
            }
            System.out.println();
        }
    }
}
