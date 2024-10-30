import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn "key" lên một vị trí
            while (j >= 0 && list[j] > key) {
                System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
            System.out.println("List after the  " + i + "' sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
        }
    }
}
