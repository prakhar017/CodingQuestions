package java.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Executor executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> voidCompletableFuture1 = CompletableFuture.runAsync(() -> {
            System.out.println(" Thread which is running" + Thread.currentThread().getName());

        }, executor);


        CompletableFuture<Void> voidCompletableFuture2 = CompletableFuture.runAsync(() -> {
            System.out.println(" Thread which is running" + Thread.currentThread().getName());

        }, executor);

        CompletableFuture<Void> voidCompletableFuture3 = CompletableFuture.runAsync(() -> {
            System.out.println(" Thread which is running" + Thread.currentThread().getName());

        }, executor);


        CompletableFuture<Void> voidCompletableFuture4 = CompletableFuture.runAsync(() -> {
            System.out.println(" Thread which is running" + Thread.currentThread().getName());

        });

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(voidCompletableFuture1, voidCompletableFuture2,
                voidCompletableFuture3, voidCompletableFuture4);

        voidCompletableFuture.get();

        CompletableFuture<String> handle = CompletableFuture.supplyAsync(() -> "Hello")
                .handle((result, ex) -> {
                    if (ex == null)
                        return result.toLowerCase();
                    return "Error occured";

                });

        System.out.println(handle.get());


        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(first -> CompletableFuture.supplyAsync(() -> first + "World "));

        System.out.println(stringCompletableFuture.get());


        CompletableFuture<Void> voidCompletableFuture5 = CompletableFuture.runAsync(() -> {
            System.out.println("I don't return any value");
        });

        System.out.println(voidCompletableFuture.get());


        CompletableFuture<Object> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(greeting -> greeting + "World");

        System.out.println(completableFuture.get());


        CompletableFuture<String> no_exception_occured = CompletableFuture.supplyAsync(() -> "success").handle((result, ex) -> {
            if (ex == null)
                System.out.println("No exception occured");
            return result.toUpperCase();
        });

        System.out.println(no_exception_occured.get());

        CompletableFuture<Object> error_occured = CompletableFuture.supplyAsync(() -> {
            try {
                throw new Exception("Error");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).handle((result, ex) -> {
            if (ex == null)
                return result;
            System.out.println("Error occured");
            return 5;
        });


        System.out.println(error_occured.get());


    }
}
