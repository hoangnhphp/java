import java.util.Stack;

public class ParenthesisChecking {
    public static boolean isParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else if (input.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
