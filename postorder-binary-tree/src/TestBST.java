public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(20);
        tree.insert(15);
        tree.insert(26);
        tree.insert(14);
        tree.insert(18);
        tree.insert(24);
        tree.insert(28);
        //traverse tree
        System.out.println("Post-order (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}