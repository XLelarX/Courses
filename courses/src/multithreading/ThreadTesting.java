package multithreading;

import java.lang.reflect.InvocationTargetException;

public class ThreadTesting {

    public static void main(String... args) throws InterruptedException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Count count = new Count();
//
//        JThread jThread = new JThread(count);
//
//        jThread.setDaemon(true);
//
//        jThread.start();
//
//
//        synchronized (count) {
//            count.wait();
//        }

//        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("second branch stopped");
//        });
//
//        thread.start();
////        Thread.sleep(3000);
//        System.out.println("end");


        Object lock = new Object();
        Thread taskThread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(2000);
                    synchronized (lock) {
                        System.out.println("Вечность не бесконечна");
                        lock.notify();
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        });
        taskThread.setDaemon(true);
        taskThread.start();
        synchronized (lock) {
            lock.wait();
        }
    }
}


class Count {
    int x = 0;

    public void increment() {
//        for (int i = 0; i < 5; i++) {
//            x++;
//            System.out.println(x);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        try {
            do {
                Thread.sleep(5000);

                synchronized (this) {
                    System.out.println("1 sec");
                    notify();
                }
            } while (true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        }
    }
}
