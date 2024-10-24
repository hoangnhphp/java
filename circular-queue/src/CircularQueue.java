public class CircularQueue {
    Node front, rear;

    public CircularQueue() {
        this.front = this.rear = null;
    }

    // Thêm phần tử vào cuối hàng đợi (enQueue)
    public void enQueue(int value) {
        Node newNode = new Node(value);

        // Nếu hàng đợi rỗng, front và rear đều trỏ đến node mới
        if (front == null) {
            front = rear = newNode;
            rear.link = front;  // Liên kết rear với front để tạo vòng
        } else {
            rear.link = newNode;  // rear trỏ đến node mới
            rear = newNode;       // Cập nhật rear là node mới
            rear.link = front;    // rear trỏ lại đến front để tạo liên kết vòng
        }
    }

    // Lấy và loại bỏ phần tử từ đầu hàng đợi (deQueue)
    public void deQueue() {
        if (front == null) {
            System.out.println("Hàng đợi rỗng, không thể deQueue.");
        } else if (front == rear) {
            // Nếu chỉ có một phần tử
            System.out.println("Phần tử được loại bỏ: " + front.data);
            front = rear = null;  // Đặt hàng đợi về rỗng
        } else {
            // Nếu có nhiều hơn một phần tử
            System.out.println("Phần tử được loại bỏ: " + front.data);
            front = front.link;   // Di chuyển front đến node tiếp theo
            rear.link = front;    // rear trỏ lại đến front mới để tạo vòng
        }
    }

    // Hiển thị các phần tử trong hàng đợi (displayQueue)
    public void displayQueue() {
        if (front == null) {
            System.out.println("Hàng đợi rỗng.");
            return;
        }
        Node temp = front;
        System.out.println("Các phần tử trong hàng đợi:");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);  // Lặp lại cho đến khi quay lại front
        System.out.println();
    }
}
