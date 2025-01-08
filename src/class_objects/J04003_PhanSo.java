package class_objects;

import java.util.Scanner;

class PhanSo {
    private long a, b;

    PhanSo() {
        a = 0;
        b = 1;
    }

    PhanSo(long a, long b) {
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
        return a/g + "/" + b/g;
    }
}

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo f = new PhanSo(a, b);
        System.out.println(f);
    }
}
