public class Main {
    public static void main(String[] args) {
        NumberGenerator f_generator = new NumberGenerator();
        NumberGenerator s_generator = new NumberGenerator();

        Thread f_thread = new Thread(f_generator);
        Thread s_thread = new Thread(s_generator);

        f_thread.setPriority(Thread.MAX_PRIORITY);
        s_thread.setPriority(Thread.MIN_PRIORITY);

        f_thread.start();
        s_thread.start();
    }
}
