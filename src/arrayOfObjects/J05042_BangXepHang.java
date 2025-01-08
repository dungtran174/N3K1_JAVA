package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student6> list = new ArrayList<>();

        while (t-- > 0) {
            sc.nextLine();
            list.add(new Student6(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        list.sort((a, b) -> a.correct == b.correct ? (a.submit == b.submit ? a.name.compareTo(b.name) : a.submit - b.submit)
                : b.correct - a.correct);
        list.forEach(System.out::println);
    }
}
class Student6 {
    String name;
    int correct, submit;

    public Student6(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }
    @Override
    public String toString() {
        return name + " " + correct + " " + submit;
    }
}
//2
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600