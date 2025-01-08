package arrayOfObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class J05032_TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Human> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new Human(sc.nextLine().trim().split("\\s+")));
        }
        list.sort((a, b) -> b.dob.compareTo(a.dob));
        System.out.println(list.get(0) + "\n" + list.get(n-1));
        sc.close();
    }
}
class Human {
    String name;
    Date dob;
    public Human(String[] list) throws ParseException {
        this.name = list[0];
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(list[1]);
    }

    @Override
    public String toString() {
        return name;
    }
}

//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990