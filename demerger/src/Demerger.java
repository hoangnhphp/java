import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Demerger {
    public static void main(String[] args) {
        Queue<Employee> NU = new LinkedList<>();
        Queue<Employee> NAM = new LinkedList<>();

        // Giả sử dữ liệu đã được đọc từ file và đưa vào danh sách records
        Employee[] records = {
                new Employee("Anna", "Female", "1990-01-01"),
                new Employee("John", "Male", "1985-05-20"),
                new Employee("Lisa", "Female", "1992-03-15"),
                new Employee("Mark", "Male", "1988-07-30")
        };

        // Phân loại các bản ghi vào các Queue
        for (Employee record : records) {
            if (record.getGender().equalsIgnoreCase("Female")) {
                NU.add(record);
            } else {
                NAM.add(record);
            }
        }

        // Ghi dữ liệu vào file output
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_records.txt"))) {
            while (!NU.isEmpty()) {
                writer.write(NU.poll().toString());
                writer.newLine();
            }
            while (!NAM.isEmpty()) {
                writer.write(NAM.poll().toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Dữ liệu đã được tổ chức lại và ghi vào file sorted_records.txt");
    }
}
