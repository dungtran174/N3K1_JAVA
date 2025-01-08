package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Human {
    String ho, dem, ten;

    public Human(String[] name) {
        this.ho = chuanHoa(name[0]);
        this.ten = chuanHoa(name[name.length - 1]);
        this.dem = chuanHoa(String.join(" ", Arrays.copyOfRange(name, 1, name.length - 1)));
    }

    public String chuanHoa(String name) {
        String[] s = name.trim().split("\\s+");
        String res = "";
        for (String i : s) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res;
    }

    @Override
    public String toString() {
        return ho + " " + dem + " " + ten;
    }
}

public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Human> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(new Human(sc.nextLine().trim().split("\\s+")));
        }
        list.sort((a, b) -> {
            if (!a.ten.equals(b.ten)) {
                return a.ten.compareTo(b.ten);
            }
            if (!a.ho.equals(b.ho)) {
                return a.ho.compareTo(b.ho);
            }
            return a.dem.compareTo(b.dem);
        });
        list.forEach(System.out::println);
    }
}
