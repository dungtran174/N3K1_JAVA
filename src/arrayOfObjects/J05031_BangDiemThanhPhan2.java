package arrayOfObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05031_BangDiemThanhPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Bang1> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            list.add(new Bang1(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        list.sort(Comparator.comparing(a -> a.name));
        for(int i = 0; i < t; i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
        sc.close();
    }
}
class Bang1 {
    String id, name, gr;
    float d1, d2, d3;

    public Bang1(String id, String name, String gr, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gr + " " + d1 + " " + d2 + " " + d3;
    }
}

//3
//B20DCCN999
//Nguyen Van Nam
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van An
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Nguyen Van Binh
//D20CQCN01-B
//9.0
//5.0
//6.0
