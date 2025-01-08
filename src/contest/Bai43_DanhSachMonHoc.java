package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class MonHoc{
    private String id, ten;
    private int tc;
    public MonHoc(String id, String ten, int tc){
        this.id = id;
        this.ten = ten;
        this.tc = tc;
    }
    public String getten(){
        return this.ten;
    }
    public String toString(){
        return this.id + " " + this.ten + " " + this.tc;
    }
}
public class Bai43_DanhSachMonHoc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            MonHoc []a = new MonHoc[n];
            for(int i = 0;i<n;i++){
                sc.nextLine();
                a[i] = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt());
            }
            Arrays.sort(a, new Comparator<MonHoc>(){
                public int compare(MonHoc a, MonHoc b){
                    return a.getten().compareTo(b.getten());
                }
            });
            for(MonHoc x: a) System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
2
INT1155
Tin hoc co so 2
2
SKD1103
Ky nang tao lap Van ban
1

SKD1103 Ky nang tao lap Van ban 1
INT1155 Tin hoc co so 2 2
 */
