public class EvenThread extends Thread {
    
    public EvenThread() {}
    
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.out.println("Even Thread Error: " + e.getMessage());
            }
        }
    }
}
