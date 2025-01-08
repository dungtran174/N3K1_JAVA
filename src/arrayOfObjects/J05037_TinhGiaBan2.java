package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Item2> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new Item2(i + 1, sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        list.sort((a, b) -> b.onSale() - a.onSale());
        list.forEach(System.out::println);
    }
}

class Item2 {
    String id, name, unit;
    int purchase, amount;

    public Item2(int id, String name, String unit, int purchase, int amount) {
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.unit = unit;
        this.purchase = purchase;
        this.amount = amount;
    }

    public int shippingfee() {
        return (int) Math.round(purchase * amount * 0.05);
    }

    public int total() {
        return Math.round(purchase * amount + shippingfee());
    }

    public int onSale() {
        return (int) Math.ceil((total() * 1.02 / amount) / 100) * 100;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + shippingfee() + " "
                + total() + " " + onSale();
    }
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430