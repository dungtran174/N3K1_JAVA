package sapXepMaTran;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("MATRIX.in");
            Scanner scanner = new Scanner(file);

            int numTests = scanner.nextInt();
            for (int t = 0; t < numTests; t++) {
                int N = scanner.nextInt();
                int M = scanner.nextInt();
                int i = scanner.nextInt();
                int[] data = new int[N * M];
                for (int j = 0; j < N * M; j++) {
                    data[j] = scanner.nextInt();
                }
                Matrix matrix = new Matrix(N, M, data);
                matrix.sortColumn(i);
                System.out.print(matrix.toString());
                if (t < numTests - 1) {
                    System.out.println();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file MATRIX.in.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}

