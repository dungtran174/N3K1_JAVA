package contest;

import java.util.*;
import java.io.*;

public class Bai38_DocFileVanBan {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNextLine()) System.out.println(sc.nextLine());
        } catch (FileNotFoundException Er) {
            Er.printStackTrace();
        }
    }
}
/*
Lap trinh huong doi tuong
voi Java

Lap trinh huong doi tuong
voi Java
 */
