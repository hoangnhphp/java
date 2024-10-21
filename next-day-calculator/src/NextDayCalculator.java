import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class NextDayCalculator {
    public static LocalDate getNextDay (LocalDate date) {
        return date.plusDays(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày trong tháng với định dạng [dd/MM/yyyy] : ");
        String day = sc.nextLine();
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = null;

        // Cố gắng chuyển đổi chuỗi với từng định dạng khác nhau
        DateTimeFormatter[] possibleFormatters = {
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("MM/dd/yyyy"),
                DateTimeFormatter.ofPattern("yyyy/MM/dd")
        };

        for (DateTimeFormatter formatter : possibleFormatters) {
            try {
                date = LocalDate.parse(day, formatter);
                break; // Nếu không có lỗi, thoát vòng lặp
            } catch (DateTimeParseException e) {
                // Nếu lỗi, tiếp tục thử định dạng tiếp theo
            }
        }

        if (date != null) {
            // Cộng thêm 1 ngày
            LocalDate nextDay = getNextDay(date);

            // Chuyển thành chuỗi định dạng dd/MM/yyyy
            String nextDayString = nextDay.format(outputFormatter);

            // In ra kết quả
            System.out.println("Chuỗi ngày hôm sau: " + nextDayString);
        } else {
            System.out.println("Chuỗi thời gian không hợp lệ hoặc không hỗ trợ định dạng này.");
        }
    }
}
