public class Geometry {
    public static void main(String[] args) {
        // in hình chữ nhật
        System.out.println("Hình chữ nhất");
        int a = 6, b=3;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        // in hình tam giác vuông
        System.out.println("Hình tam giác vuông");
        int x = 6;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        // in hình tam giác vuông ngược
        System.out.println("Hình tam giác vuông ngược");
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
