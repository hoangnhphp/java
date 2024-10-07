public class Print20Prime {
    public static void main(String[] args) {
        int count = 20, i, number = 2, j = 0;
        boolean check;
        while (j < count) {
            check = true;
            i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                j++;
            }
            number++;
        }
    }
}
