package Demo2;

public class Example {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable("Khoa");
        Thread t1 = new Thread(myRunnable);
        t1.start();
        MyRunnable myRunnable1 = new MyRunnable("Hieu");
        Thread t2 = new Thread(myRunnable1);
        t2.start();
    }
}
