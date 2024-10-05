import java.util.Scanner;

public class SummaryColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        int[][] array;
        do {
            System.out.print("Nhập độ rộng của mảng: ");
            size1 = scanner.nextInt();
            if (size1 > 10)
                System.out.println("độ rộng của mảng không quá 10");
        } while (size1 > 10);

        do {
            System.out.print("Nhập độ rộng của mảng con: ");
            size2 = scanner.nextInt();
            if (size2 > size1)
                System.out.println("độ rộng của mảng con không quá số vừa nhập");
        } while (size2 > size1);
        array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Nhập phần tử thứ " + j + " của mảng thứ " + i + " : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.printf("Nhập số cột: ", "");
        int column = scanner.nextInt();
        int tong = sum(array, column);

        System.out.println("tổng của cột " + column + " là: " + tong);
    }

    public static int sum(int[][] array, int column) {
        int sum = 0;
        for (int[] ints : array) {
            sum += ints[column];
        }

        return sum;
    }
}
