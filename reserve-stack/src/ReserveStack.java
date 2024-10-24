import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReserveStack {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        stack.clear();
        System.out.println(Arrays.toString(arr));

        String wStack = "Đảo ngược chuỗi sử dụng Stack";
        Stack<String> nStack = new Stack<>();
        String[] wArr = wStack.split(" ");
        for (String s : wArr) {
            nStack.push(s);
        }
        StringBuilder rString = new StringBuilder();
        while (!nStack.isEmpty()) {
            rString.append(nStack.pop()).append(" ");
        }

        String result = rString.toString().trim();
        System.out.println(result);
    }
}
