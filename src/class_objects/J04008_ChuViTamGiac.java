package class_objects;

import java.util.Scanner;

class Triangle {
    double x1, y1, x2, y2, x3, y3;
    double a, b, c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    }

    @Override
    public String toString() {
        return (a + b > c && a + c > b && b + c > a) ? String.format("%.3f", a + b + c) : "INVALID";
    }
}

public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Triangle tr = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(tr);

        }
    }
}
