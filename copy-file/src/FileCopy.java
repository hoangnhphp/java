import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nhập đường dẫn tập tin nguồn: ");
            String sourcePath = reader.readLine();
            System.out.print("Nhập đường dẫn tập tin đích: ");
            String targetPath = reader.readLine();

            // Kiểm tra sự tồn tại của tập tin nguồn
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                System.out.println("Tập tin nguồn không tồn tại.");
                return;
            }

            // Kiểm tra sự tồn tại của tập tin đích
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                System.out.println("Tập tin đích đã tồn tại. Hãy chọn một tên khác.");
                return;
            }

            // Sao chép nội dung từ tệp nguồn sang tệp đích
            int charCount = copyFile(sourceFile, targetFile);
            System.out.println("Đã sao chép thành công " + charCount + " ký tự.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc dữ liệu từ bàn phím.");
            e.printStackTrace();
        }
    }

    public static int copyFile(File sourceFile, File targetFile) {
        int charCount = 0;
        try (
                FileReader fileReader = new FileReader(sourceFile);
                FileWriter fileWriter = new FileWriter(targetFile)
        ) {
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                charCount++;
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp tin.");
            e.printStackTrace();
        }
        return charCount;
    }
}
