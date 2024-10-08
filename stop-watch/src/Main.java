import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }
        StopWatch sw = new StopWatch();
        // Ghi lại thời gian bắt đầu
        sw.start();

        // Thực hiện sắp xếp
        selectionSort(arr);

        // Ghi lại thời gian kết thúc
        sw.stop();

        System.out.println("Thời gian thực hiện: " + (sw.getElapsedTime()) + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong đoạn chưa sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất tìm được với phần tử đầu tiên của đoạn chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
