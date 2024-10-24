import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String input = "Chương trình đếm các lần xuất hiện của từ trong một văn bản và hiển thị các từ và sự xuất hiện của chúng theo thứ tự trong bảng chữ cái của các từ";
        TreeMap<String, Integer> map = new TreeMap<>();
        String[] words = input.toLowerCase().split(" ");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Từ và số lần xuất hiện trong chuỗi:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
