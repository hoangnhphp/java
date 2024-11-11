public class Main {
    public static void main(String[] args) {
        // Tạo các runnable
        LazyPrimeFactorization lazyPrimeFinder = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFinder = new OptimizedPrimeFactorization();

        // Tạo hai thread với các runnable
        Thread thread1 = new Thread(lazyPrimeFinder);
        Thread thread2 = new Thread(optimizedPrimeFinder);

        // Start cả hai thread
        thread1.start();
        thread2.start();
    }
}
