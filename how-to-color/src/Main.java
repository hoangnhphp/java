import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(), new Rectangle(), new Circle()};
        for (Shape shape : shapes) {
            if (shape instanceof Square square) {
                square.howToColor();
            } else {
                System.out.println(shape);
            }
        }
    }
}
