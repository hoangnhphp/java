import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;
import com.codegym.Square;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int percent = generator.nextInt(100);
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Circle circle) {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                circle.setRadius(radius);
                System.out.println(circle);
                circle.resize(percent);
                System.out.println("After resize " + percent + "%");
                System.out.println(circle);
            }

            if (shape instanceof Rectangle rectangle) {
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                rectangle.setWidth(width);
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                rectangle.setLength(length);
                System.out.println(rectangle);
                rectangle.resize(percent);
                System.out.println("After resize " + percent + "%");
                System.out.println(rectangle);
            }

            if (shape instanceof Square square) {
                System.out.print("Enter the width of the square: ");
                double width = scanner.nextDouble();
                square.setWidth(width);
                System.out.println(square);
                square.resize(percent);
                System.out.println("After resize " + percent + "%");
                System.out.println(square);
            }
        }
    }
}
