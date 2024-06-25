package multithreading;

public class JThread extends Thread {

    private Count count;

    JThread(String name, Count count) {
        super(name);
        this.count = count;
    }

    public JThread() {
    }

    public JThread(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.increment();
    }
}
