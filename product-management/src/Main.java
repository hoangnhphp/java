public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Thêm sản phẩm
        manager.addProduct(new Product(1, "Laptop", 1500.0));
        manager.addProduct(new Product(2, "Smartphone", 800.0));
        manager.addProduct(new Product(3, "Tablet", 600.0));

        // Hiển thị danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        manager.displayProducts();

        // Sửa sản phẩm
        manager.updateProduct(2, "Smartphone Pro", 850.0);
        System.out.println("\nDanh sách sản phẩm sau khi cập nhật:");
        manager.displayProducts();

        // Xoá sản phẩm
        manager.deleteProduct(1);
        System.out.println("\nDanh sách sản phẩm sau khi xoá:");
        manager.displayProducts();

        // Tìm kiếm sản phẩm
        System.out.println("\nTìm kiếm sản phẩm có tên 'Tablet':");
        manager.searchProductByName("Tablet");

        // Sắp xếp tăng dần theo giá
        manager.sortProductsByPriceAscending();
        System.out.println("\nDanh sách sản phẩm sắp xếp tăng dần theo giá:");
        manager.displayProducts();

        // Sắp xếp giảm dần theo giá
        manager.sortProductsByPriceDescending();
        System.out.println("\nDanh sách sản phẩm sắp xếp giảm dần theo giá:");
        manager.displayProducts();
    }
}
