package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05049_LietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Product3> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            list.add(new Product3(sc.next(), sc.nextInt()));
        }
        list.sort((a, b) -> b.getTariff() - a.getTariff());
        String k = sc.next();
        for(Product3 p : list) {
            if(p.getId().startsWith(k)) {
                System.out.println(p);
            }
        }
    }
}

class Product3 {
    private String id;
    private int importQuantity;

    public Product3(String id, int importQuantity) {
        this.id = id;
        this.importQuantity = importQuantity;
    }

    public String getId() {
        return id;
    }

    public int getExportQuantity() {
        if (id.startsWith("A")) return (int) Math.round(0.6 * importQuantity);
        if (id.startsWith("B")) return (int) Math.round(0.7 * importQuantity);
        return 0;
    }

    public int getUnitPrice() {
        if (id.endsWith("Y")) return 110000;
        if (id.endsWith("N")) return 135000;
        return 0;
    }

    public int getTotalPrice() {
        return getExportQuantity() * getUnitPrice();
    }

    public int getTariff() {
        if (id.startsWith("A") && id.endsWith("Y")) return (int) Math.round(0.08 * getTotalPrice());
        if (id.startsWith("A") && id.endsWith("N")) return (int) Math.round(0.11 * getTotalPrice());
        if (id.startsWith("B") && id.endsWith("Y")) return (int) Math.round(0.17 * getTotalPrice());
        if (id.startsWith("B") && id.endsWith("N")) return (int) Math.round(0.22 * getTotalPrice());
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + importQuantity + " " + getExportQuantity() + "  " +
                " " + getUnitPrice() + " " + getTotalPrice() + " " + getTariff();
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B