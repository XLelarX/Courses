package multithreading.synchronize;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SynchronizedBlockProgram {
    public static void main(String[] args) {
        DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");

        LocalDateTime parse = LocalDateTime.parse("2022-06-15T13:08:57.324856", LOCAL_DATE_TIME_FORMATTER);
        System.out.println(parse);
    }

    static class CountThread implements Runnable {
        private CommonResource res;

        CountThread(CommonResource res) {
            this.res = res;
        }

        public void run() {
            synchronized (res) {
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
}
