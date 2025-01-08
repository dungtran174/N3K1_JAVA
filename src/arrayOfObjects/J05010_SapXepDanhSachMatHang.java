package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Item> item = new ArrayList<>();
        for(int i = 1; i <= t; i++) {
            item.add(new Item(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), i));
        }
        item.sort((a, b) -> -a.profit.compareTo(b.profit));
        item.forEach(System.out::println);
        sc.close();
    }
}
class Item {
    String name, type;
    Float purchase, sale, profit;
    Integer id;

    public Item(String name, String type, Float purchase, Float sale, Integer i) {
        this.name = name;
        this.type = type;
        this.purchase = purchase;
        this.sale = sale;
        this.id = i;
        this.profit = sale - purchase;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + type + " " + String.format("%.2f", profit);
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37