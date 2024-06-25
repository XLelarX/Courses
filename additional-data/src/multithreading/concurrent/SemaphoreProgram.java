package multithreading.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreProgram {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        for (int i = 1; i < 4; i++)
            new Philosopher(sem).start();
    }
}

class Philosopher extends Thread {
    private Semaphore sem;
    private int num = 0;

    Philosopher(Semaphore sem) {
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            while (num < 2) {
                sem.acquire();
                System.out.println(this.getName() + " блокирует ресурс");

                sleep(1000);
                num++;

                System.out.println(this.getName() + " освобождает ресурс");
                sem.release();

                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("прерывание");
        }
    }
}
