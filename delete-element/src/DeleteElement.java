import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int index_del;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("old array");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a index:");
            index_del = scanner.nextInt();
            if (index_del > array.length)
                System.out.println("index does exists");
        } while (index_del > array.length);
        int[] arr = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index_del) {
                continue;
            }
            arr[k++] = array[i];
        }
        System.out.println("new array");
        System.out.println(Arrays.toString(arr));
    }
}
