public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);

        System.out.println("Danh sách hiện tại:");
        list.printList();

        System.out.println("Size của danh sách: " + list.size());

        System.out.println("Phần tử tại vị trí 2: " + list.get(2));

        list.remove(2); // Xóa phần tử tại index 2
        System.out.println("Danh sách sau khi xóa phần tử tại index 2:");
        list.printList();

        list.remove((Object) 40); // Xóa phần tử có giá trị 40
        System.out.println("Danh sách sau khi xóa phần tử 40:");
        list.printList();

        System.out.println("Danh sách có chứa phần tử 20 không? " + list.contains(20));
        System.out.println("Vị trí của phần tử 20: " + list.indexOf(20));

        // Test clone
        MyLinkedList clonedList = list.clone();
        System.out.println("Danh sách clone:");
        clonedList.printList();
    }
}
