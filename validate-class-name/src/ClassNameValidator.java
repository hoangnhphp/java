public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy để kiểm tra tên lớp học
        String regex = "^[CAP][0-9]{4}[GHIK]$";

        // Kiểm tra tính hợp lệ của tên lớp bằng biểu thức chính quy
        return className.matches(regex);
    }
}
