public class TestCircle extends Circle {

    public void display() {
        double radius = getRadius();
        String color = getColor();

        System.out.println("Radius: " + radius + "\nColor: " + color);
    }
    public static void main(String[] args) {
        TestCircle testCircle = new TestCircle();
        testCircle.display();
    }
}
