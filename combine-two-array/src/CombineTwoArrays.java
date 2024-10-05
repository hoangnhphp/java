import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2, j = 0, i = 0;
        int[] array1, array2;
        do {
            System.out.print("Nhập độ rộng của mảng thứ nhất: ");
            size1 = scanner.nextInt();
            if (size1 > 10)
                System.out.println("độ rộng của mảng không quá 10");
        } while (size1 > 10);
        array1 = new int[size1];
        while (i < array1.length) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng đầu tiên: ");
            array1[i] = scanner.nextInt();
            i++;
        }
        do {
            System.out.print("Nhập độ rộng của mảng thứ 2: ");
            size2 = scanner.nextInt();
            if (size2 > 10)
                System.out.println("độ rộng của mảng không quá 10");
        } while (size2 > 10);
        array2 = new int[size2];
        while (j < array2.length) {
            System.out.print("Nhập phần tử thứ " + j + " của mảng đầu thứ 2: ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] res = new int[size1 + size2];
        System.arraycopy(array1, 0, res, 0, size1);
        for (int h = size1, l = 0; h < res.length; h++) {
            res[h] = array2[l++];
        }

        System.out.println(Arrays.toString(res));
    }
}
