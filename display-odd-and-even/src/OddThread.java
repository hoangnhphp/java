public class OddThread extends Thread {

    public OddThread() {}

    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Odd Thread Error: " + e.getMessage());
            }
        }

    }
}
