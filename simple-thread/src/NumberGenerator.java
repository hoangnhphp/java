public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        System.out.println("10 số tự nhiên đầu tiên");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Lỗi thread");
            }
        }
    }
}
