public class FizzBuzzTranslate {
    public static String fizzBuzz(int n) {
        String fizzBuzz = "";
        String numberStr = Integer.toString(n);
        if (n % 3 == 0 && n % 5 == 0) {
            fizzBuzz = "FizzBuzz";
        } else if (n % 3 == 0 || numberStr.contains("3")) {
            fizzBuzz = "Fizz";
        } else if (n % 5 == 0 || numberStr.contains("5")) {
            fizzBuzz = "Buzz";
        } else {
            fizzBuzz = numToWord(n);
        }

        return fizzBuzz;
    }

    public static String numToWord(int n) {
        String word = "";
        if (n >= 100) {
            return "Số quá giới hạn!!!";
        }
        String[] arrNumLT10 = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        if (n <= 10) {
            word = arrNumLT10[n];
        } else if (n > 10 && n < 20) {
            word = "mười " + arrNumLT10[n - 10];
        } else {
            int tens = n / 10;
            int unit = n % 10;
            word = arrNumLT10[tens] + " " + arrNumLT10[unit];
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(101));
    }
}
