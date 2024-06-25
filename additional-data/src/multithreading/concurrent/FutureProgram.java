package multithreading.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class FutureProgram {
    public static void main(String[] args) throws Exception {
//        CallableImpl callable = new CallableImpl();
//
//        FutureTask<String> futureTask = new FutureTask<>(callable);
//        Thread thread = new Thread(futureTask);
//        thread.start();
//
//        thread.join();
//        System.out.println(futureTask.get());

        ExecutorService service = Executors.newFixedThreadPool(1);
        Runnable runnable = () -> {
            System.out.println("end");
        };
        service.execute(runnable);

//        Future<String> submit = service.submit(callable);
//        System.out.println(submit.get());
        Thread.sleep(1000);
        service.shutdown();

        System.out.println("main thread stopped!");
    }
}

class CallableImpl implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "method call stopped!";
    }
}

class FutureImpl implements Future<String> {

    @Override
    public boolean cancel(boolean b) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public String get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public String get(long l, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
