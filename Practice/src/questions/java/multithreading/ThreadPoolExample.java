package java.multithreading;

import java.util.concurrent.*;

public class ThreadPoolExample {


    public static void main(String[] args) throws Exception {

        // ExecutorService --> submit(callable) --> Future<String>
        Callable<String> callable = () -> "Hello from Callable";

        ExecutorService executorServiceCallable = Executors.newFixedThreadPool(1);

        Future<String> submit = executorServiceCallable.submit(callable);

        System.out.println(submit.get());




        // ExecutorService --> submit(callable - lambda) --> Future<String>
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> stringFuture = executorService.submit(() -> {
            Thread.sleep(3000);
            return ("Executing through executor service");
        });
        System.out.println(stringFuture.get());


        System.out.println("Main 2 continues");



        // ExecutorService --> submit(runnable - lambda) --> Future<?>
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<?> runnable_task = service.submit(() -> {
            System.out.println("Runnable task");
        });

        // Always null as executorservice.submit(Runnable) doesn't returns
        System.out.println(runnable_task.get());



        // ExecutorService --> execute(runnable -lambda)  -- > No return
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        executorService1.execute(() -> {
            System.out.println("Current Thread Name is " + Thread.currentThread().getName());
        });



       // Executor --> execute(runnable - lambda)  --> No return
        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Executing through executor");
        });
        System.out.println("Main 1 continues");







    }
}
