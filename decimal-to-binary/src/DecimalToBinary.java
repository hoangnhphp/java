import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int num) {
        String binary = "";
        Stack<Integer> stack = new Stack<>();
        while (num > 1) {
            stack.push(num % 2);
            num /= 2;
        }
        stack.push(num);
        while (!stack.isEmpty()) {
            binary += String.valueOf(stack.pop());
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
    }
}
