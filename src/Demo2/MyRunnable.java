package Demo2;

public class MyRunnable implements Runnable {
    String name;

    public MyRunnable() {
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for ( int i =0; i<10; i++){
            System.out.println("Thread " + name + " chay" + i);
        }
    }
}
