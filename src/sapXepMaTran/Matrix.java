package sapXepMaTran;

import java.util.Arrays;

public class Matrix {
    private int hang;
    private int cot;
    private int[][] matrix;

    public Matrix(int hang, int cot, int[] data) {
        this.hang = hang;
        this.cot = cot;
        this.matrix = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                this.matrix[i][j] = data[i * cot + j];
            }
        }
    }

    // Sắp xếp cột thứ i (index từ 1)
    public void sortColumn(int k) {
        int zeroBasedIndex = k - 1;
        int[] column = new int[hang];
        for (int i = 0; i < hang; i++) {
            column[i] = matrix[i][zeroBasedIndex];
        }
        Arrays.sort(column);
        for (int i = 0; i < hang; i++) {
            matrix[i][zeroBasedIndex] = column[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                sb.append(matrix[i][j]);
                if (j < cot - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}