package contest;

import java.io.*;
import java.util.*;

public class Bai60_LietKeSoNguyenTo {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Đọc file DATA1.in
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        // Đọc file DATA2.in
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

        // Đếm số lần xuất hiện của các số nguyên tố trong từng file
        Map<Integer, Integer> primeCount1 = new HashMap<>();
        Map<Integer, Integer> primeCount2 = new HashMap<>();

        for (int num : list1) {
            if (isPrime(num)) {
                primeCount1.put(num, primeCount1.getOrDefault(num, 0) + 1);
            }
        }

        for (int num : list2) {
            if (isPrime(num)) {
                primeCount2.put(num, primeCount2.getOrDefault(num, 0) + 1);
            }
        }

        // Tìm giao của hai tập số nguyên tố
        TreeSet<Integer> commonPrimes = new TreeSet<>(primeCount1.keySet());
        commonPrimes.retainAll(primeCount2.keySet());

        // Xuất kết quả
        for (int prime : commonPrimes) {
            System.out.println(prime + " " + primeCount1.get(prime) + " " + primeCount2.get(prime));
        }
    }
}
/*
Liệt kê các số nguyên tố xuất hiện trong cả hai file và số lần trong DATA1.in và DATA2.in
Ví dụ:
13 7 5
23 18 2
97 11 5
 */

