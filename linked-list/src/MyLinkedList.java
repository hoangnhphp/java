public class MyLinkedList {
    private Node head;
    private int numNodes;

    // Constructor - khởi tạo với một phần tử
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes = 1;
    }

    // Phương thức thêm một phần tử vào cuối danh sách
    public void add(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    // Phương thức thêm một phần tử vào đầu danh sách
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    // Phương thức thêm một phần tử vào cuối danh sách
    public void addLast(Object data) {
        add(data); // Thực chất là giống với add(data)
    }

    // Phương thức xóa phần tử tại vị trí index
    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    // Phương thức xóa phần tử cho trước
    public boolean remove(Object data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Phương thức truy cập phần tử tại vị trí index
    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Phương thức trả về số phần tử trong danh sách
    public int size() {
        return numNodes;
    }

    // Phương thức in danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Phương thức clone danh sách
    public MyLinkedList clone() {
        if (head == null) return null;

        MyLinkedList cloneList = new MyLinkedList(head.data);
        Node temp = head.next;
        while (temp != null) {
            cloneList.add(temp.data);
            temp = temp.next;
        }
        return cloneList;
    }

    // Phương thức kiểm tra phần tử có trong danh sách không
    public boolean contains(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Phương thức trả về vị trí của phần tử trong danh sách
    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // Nếu không tìm thấy
    }

    // Xóa toàn bộ danh sách
    public void clear() {
        head = null;
        numNodes = 0;
    }
}