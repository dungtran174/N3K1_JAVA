package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Item3> li = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            li.add(new Item3(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        li.forEach(System.out::println);
    }
}

class Item3 {
    String name, id;
    int unitPrice, amount;

    public Item3(String name, String id, int unitPrice, int amount) {
        this.name = name;
        this.id = id;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public String getNumber() {
        return id.substring(1, 4);
    }
    public int getDiscount(){
        if(id.endsWith("1")) return (int) Math.round(unitPrice * amount * 0.5);
        if(id.endsWith("2")) return (int) Math.round(unitPrice * amount * 0.3);
        return 0;
    }
    public int getMoney(){
        return amount * unitPrice - getDiscount();
    }
    @Override
    public String toString() {
        return name + " " + id + " " + getNumber() + " " + getDiscount() + " " + getMoney();
    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12