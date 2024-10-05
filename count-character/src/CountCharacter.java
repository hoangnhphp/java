import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "hello to the world, i am a student";
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Ký tự " + c + " xuất hiện " + count + " lần trong chuỗi \"hello to the world, i am a student\" ");
    }
}
