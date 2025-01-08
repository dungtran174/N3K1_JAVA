package arrayOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class J05040_LapBangTinhCong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Employee1> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            sc.nextLine();
            list.add(new Employee1(i + 1, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
        }
        list.forEach(System.out::println);
    }
}

class Employee1 {
    String id, name;
    int basicSalary, workingDays;
    String position;

    public Employee1(int id, String name, int basicSalary, int workingDays, String position) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
        this.position = position;
    }

    public int getSalary() {
        return basicSalary * workingDays;
    }

    public int getBonus() {
        if (workingDays >= 25) {
            return getSalary() * 2 / 10;
        }
        if (workingDays >= 22) {
            return getSalary() / 10;
        }
        return 0;
    }
    public int getAllowance() {
        switch (position){
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }
    public int getNetIncome() {
        return getSalary() + getBonus() + getAllowance();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSalary() + " " + getBonus() + " "
                + getAllowance() + " " + getNetIncome();
    }
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV