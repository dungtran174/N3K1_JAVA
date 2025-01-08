package contest;

import java.util.*;
import java.io.*;

class Mat_Hang {
    private String ten, dvt, id;
    private long mua, ban;

    public Mat_Hang(int x, String ten, String dvt, long mua, long ban) {
        this.id = String.format("MH%03d", x);
        this.ten = ten;
        this.dvt = dvt;
        this.mua = mua;
        this.ban = ban;
    }

    public long getBan() {
        return ban;
    }

    public String getTen() {
        return ten;
    }

    public String getDvt() {
        return dvt;
    }

    public long getMua() {
        return mua;
    }

    public String getId() {
        return id;
    }
}

class Hoa_Don {
    private String kh, mh, id;
    private long sl;

    public Hoa_Don(int x, String kh, String mh, long sl) {
        this.id = String.format("HD%03d", x);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    public String getKh() {
        return kh;
    }

    public String getMh() {
        return mh;
    }

    public String getId() {
        return id;
    }

    public long getSl() {
        return sl;
    }
}

public class Bai32_BaiToanBanHang {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> mp1 = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = String.format("KH%03d", i);
            String ten = sc.nextLine(), gioi = sc.nextLine(), ns = sc.nextLine(), dc = sc.nextLine();
            mp1.put(s, ten + " " + dc);
        }
        sc = new Scanner(new File("MH.in"));
        int m = sc.nextInt();
        Mat_Hang[] a = new Mat_Hang[m];
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            a[i] = new Mat_Hang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        sc = new Scanner(new File("HD.in"));
        int p = sc.nextInt();
        Hoa_Don[] b = new Hoa_Don[p];
        for (int i = 0; i < p; i++) {
            b[i] = new Hoa_Don(i + 1, sc.next(), sc.next(), sc.nextInt());
        }
        for (Hoa_Don x : b) {
            for (Mat_Hang y : a) {
                if (x.getMh().equals(y.getId())) {
                    System.out.print(x.getId() + " " + mp1.get(x.getKh()) + " ");
                    System.out.println(y.getTen() + " " + y.getDvt() + " " + y.getMua() + " " + y.getBan() + " " + x.getSl() + " " + x.getSl() * y.getBan());
                    break;
                }
            }
        }
    }
}
/*
File KH.in
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha No
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
File MH.in
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
File HD.in
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4

HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em Cai 25000 41000 2 82000
HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam Cai 240000 515000 3 1545000
HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam Cai 240000 515000 4 2060000
 */
