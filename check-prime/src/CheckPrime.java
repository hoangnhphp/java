import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int max = 100;
        for (int number = 2; number <= max; number++) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(number);
        }
    }
}
