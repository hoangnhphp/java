import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        float x = sc.nextFloat();
        System.out.print("Nhập y: ");
        float y = sc.nextFloat();

        System.out.print("Nhập tốc độ của x: ");
        float xSpeed = sc.nextFloat();

        System.out.print("Nhập tốc độ của y: ");
        float ySpeed = sc.nextFloat();

        MoveablePoint moveablePoint = new MoveablePoint(x, y, xSpeed, ySpeed);
        System.out.println("\nThông tin của Point:");
        System.out.println(moveablePoint);
        System.out.println("\nThông tin của Point sau di chuyển:");
        System.out.println(moveablePoint.move());

        sc.close();
    }
}
