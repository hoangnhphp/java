public class Main {
    public static void main(String[] args) {
        // Kiểm thử lớp Circle
        Circle circle = new Circle(5.0f, "Red");
        System.out.println(circle.toString());

        // Kiểm thử lớp Cylinder
        Cylinder cylinder = new Cylinder(5.0f, "Blue", 10.0f);
        System.out.println(cylinder.toString());
    }
}
