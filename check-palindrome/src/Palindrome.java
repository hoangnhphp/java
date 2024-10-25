import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Chuẩn bị chuỗi: loại bỏ ký tự không phải chữ cái hoặc số, chuyển thành chữ thường
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Khởi tạo Queue và Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Đưa từng ký tự vào Queue và Stack
        for (char c : cleanedString.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // So sánh từng phần tử của Queue và Stack
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false; // Nếu không khớp, không phải là Palindrome
            }
        }

        return true; // Nếu tất cả phần tử khớp, là Palindrome
    }

    public static void main(String[] args) {
        String testString = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(testString));
    }
}
