import java.util.Scanner;

public class TriangleClassifier {
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String checkTriangle(int canh1, int canh2, int canh3) {
        if (isTriangle(canh1, canh2, canh3)) {
            if (canh1 == canh2 && canh2 == canh3) {
                return "tam giác đều";
            } else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
                return "tam giác cân";
            } else {
                return "tam giác thường";
            }
        } else {
            return "không phải là tam giác";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh thứ nhất:");
        int canh1 = sc.nextInt();

        System.out.print("Nhập độ dài cạnh thứ hai:");
        int canh2 = sc.nextInt();

        System.out.print("Nhập độ dài cạnh thứ ba:");
        int canh3 = sc.nextInt();
        System.out.println(checkTriangle(canh1, canh2, canh3));
    }
}
