import Interface.Colorable;
import com.codegym.*;

import java.util.Objects;

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
