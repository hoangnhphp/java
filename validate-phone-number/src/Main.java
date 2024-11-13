import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại có định dạng (xx)-(0xxxxxxxxx)");
        String phoneNumber = scanner.nextLine();
        if (Validator.isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ!!!!");
        }
    }
}
