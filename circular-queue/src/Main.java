public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        // Thêm phần tử vào hàng đợi
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        // Hiển thị hàng đợi
        queue.displayQueue();

        // Lấy phần tử ra khỏi hàng đợi
        queue.deQueue();
        queue.deQueue();

        // Hiển thị hàng đợi sau khi lấy ra phần tử
        queue.displayQueue();
    }
}
