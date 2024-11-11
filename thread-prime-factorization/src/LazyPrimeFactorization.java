public class LazyPrimeFactorization implements Runnable {

    public void run() {
        int number = 2; // Bắt đầu từ số 2
        while (number < 100) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization found prime: " + number);
            }
            number++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
