package Demo1;

public class Ex {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Khoa Ga");
        t1.start();
        MyThread t2 = new MyThread("Meme");
        t2.start();
    }
}
