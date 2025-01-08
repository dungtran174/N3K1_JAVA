package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05044_LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Employee4> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            list.add(new Employee4(i + 1, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        String k = sc.next();
        for(Employee4 employee4 : list) {
            if (employee4.position.equals(k)) {
                System.out.println(employee4);
            }
        }
    }
}

class Employee4 {
    String id, name, position;
    int basicSalary, workingDays;

    public Employee4(int id, String name, String position, int basicSalary, int workingDays) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
    }

    public int getSalary() {
        return basicSalary * workingDays;
    }

    public int getAllowance() {
        switch (position) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }

    public int getAdvancePayment() {
        double advancePayment = (getSalary() + getAllowance()) * 2 / 3;
        if (advancePayment < 25000) {
            return (int) Math.round(advancePayment / 1000) * 1000;
        }
        return 25000;
    }

    public int getNetIncome() {
        return getSalary() + getAllowance() - getAdvancePayment();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getAllowance() + " " + getSalary() + " "
                + getAdvancePayment() + " " + getNetIncome();
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
//TP
