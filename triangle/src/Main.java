import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double side1 = sc.nextDouble();

        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double side2 = sc.nextDouble();

        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double side3 = sc.nextDouble();

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = sc.next();

        System.out.print("Tam giác đã được tô màu chưa (true/false): ");
        boolean filled = sc.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\nThông tin của tam giác:");
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println(triangle.toString());

        sc.close();
    }
}
