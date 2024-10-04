import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int new_value;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("old array");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new value:");
        new_value = scanner.nextInt();
        int[] arr = new int[array.length + 1];
        System.arraycopy(array, 0, arr, 0, array.length);
        arr[arr.length - 1] = new_value;
        System.out.println("new array");
        System.out.println(Arrays.toString(arr));
    }
}
