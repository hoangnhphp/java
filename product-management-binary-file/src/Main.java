import java.util.List;
import java.util.Scanner;

public class Main {
    private static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        List<Product> products;
        Product product;
        while (true) {
            System.out.println("Menu quản lý sản phầm");
            System.out.println("1. Hiển thị danh sách sản phầm");
            System.out.println("2. Thêm mới sản phầm");
            System.out.println("3. Tìm kiếm sản phầm theo tên");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    products = readAndWriteFile.getAll();
                    display(products);
                    break;
                case 2:
                    product = inputProduct();
                    readAndWriteFile.save(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Tìm kiếm học sinh theo tên");
                    String name = scanner.nextLine();
                    products = readAndWriteFile.searchByName(name);
                    display(products);
                    break;
                case 4:
                    return;
            }
        }
    }

    private static int inputChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return 0;
    }

    public static void display(List<Product> products) {
        System.out.println("Danh sách sản phẩm");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    private static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.print("Mời bạn nhập mô tả sản phầm: ");
        String description = scanner.nextLine();
        return new Product(code, name, price, producer, description);
    }
}
