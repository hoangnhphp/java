public class Main {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int left, int right,int key) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (key < list[mid]) {
                right = mid - 1;
                mid = binarySearch(list, left, right, key);
            }
            else if (key == list[mid])
                return mid;
            else {
                left = mid + 1;
                mid = binarySearch(list, left, right, key);
            }
        } else {
            mid = -1;
        }

        return mid;
    }

    public static void main(String[] args) {
        int low = 0;
        int high = list.length - 1;
        System.out.println(binarySearch(list, low, high,2));  /* 0 */
        System.out.println(binarySearch(list, low, high, 11)); /* 4 */
        System.out.println(binarySearch(list, low, high, 79)); /*12 */
        System.out.println(binarySearch(list, low, high, 1));  /*-1 */
        System.out.println(binarySearch(list, low, high, 5));  /*-1 */
        System.out.println(binarySearch(list, low, high, 80)); /*-1 */
    }
}
