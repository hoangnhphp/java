public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Running .....");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Mail");
        runnableDemo2.start();

        System.out.println("Main Thread Stopped .....");
    }
}
