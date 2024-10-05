import java.util.Scanner;

public class MaxInMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        int max = 0, i, j;
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
        for (i = 0; i < size1; i++) {
            for (j = 0; j < size2; j++) {
                System.out.print("Nhập phần tử thứ " + j + " của mảng thứ " + i + " : ");
                array[i][j] = scanner.nextInt();
                if (i == 0 && j == 0) {
                    max = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
