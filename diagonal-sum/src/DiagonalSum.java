import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = sum(matrix);
        System.out.println("Tổng đường chéo của ma trận là: " + sum);
        int size;
        int[][] matrix2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng đa chiều:");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Độ dài quá lớn");
        } while (size > 10);
        matrix2 = new int[size][size];
        int i = 0;
        for (i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " của mảng thư " + (i + 1) +": ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        sum = sum(matrix2);
        System.out.println("Tổng đường chéo của ma trận vừa nhập là: " + sum);
    }

    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
