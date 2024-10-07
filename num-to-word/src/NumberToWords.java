import java.text.DecimalFormat;
public class NumberToWords {
    // Mảng chứa các từ cho các số từ 0 đến 19
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    // Mảng chứa các từ cho các chục
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Từ dùng cho các đơn vị lớn hơn
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    // Hàm chính để chuyển đổi số thành chữ
    public static String numberToWords(long num) {
        if (num == 0) return "Zero";

        String words = "";
        int thousandIndex = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words = convertBelowThousand((int) (num % 1000)) + thousands[thousandIndex] + " " + words;
            }
            num /= 1000;
            thousandIndex++;
        }

        return words.trim();
    }

    // Hàm chuyển đổi các số dưới 1000 thành chữ
    private static String convertBelowThousand(int num) {
        if (num == 0) return "";
        if (num < 20) return belowTwenty[num] + " ";
        if (num < 100) return tens[num / 10] + " " + belowTwenty[num % 10] + " ";
        return belowTwenty[num / 100] + " Hundred and " + convertBelowThousand(num % 100);
    }

    public static void main(String[] args) {
        // Test các số
        long[] testNumbers = {0, 123, 4567, 891011, 123456789};
        for (long num : testNumbers) {
            System.out.println(num + " in words: " + numberToWords(num));
        }
    }
}
