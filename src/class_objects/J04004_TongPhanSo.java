package class_objects;

import java.util.Scanner;

class Fraction {
    private long a, b;

    Fraction() {
        a = 0;
        b = 1;
    }

    Fraction(long a, long b) {
        this.a = a;
        this.b = b;
    }

    private long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    @Override
    public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        Fraction f = new Fraction(a * d + c * b, b * d);
        System.out.println(f);
    }
}
