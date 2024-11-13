public class Main {
    public static void main(String[] args) {
        // Ví dụ kiểm tra
        System.out.println(ClassNameValidator.isValidClassName("C1234G")); // true
        System.out.println(ClassNameValidator.isValidClassName("A5678H")); // true
        System.out.println(ClassNameValidator.isValidClassName("B1234G")); // false
        System.out.println(ClassNameValidator.isValidClassName("P1233G"));  // false
        System.out.println(ClassNameValidator.isValidClassName("C1234X")); // false
    }
}
