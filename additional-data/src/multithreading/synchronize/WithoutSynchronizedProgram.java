package multithreading.synchronize;

public class WithoutSynchronizedProgram {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();

        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }
    }

    static class CountThread implements Runnable {
        private CommonResource res;

        CountThread(CommonResource res) {
            this.res = res;
        }

        public void run() {
            res.init();
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.getX());
                res.increase();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

class CommonResource {
    private int x = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void increase() {
        this.x++;
    }

    public void init() {
        this.x = 1;
    }
}
