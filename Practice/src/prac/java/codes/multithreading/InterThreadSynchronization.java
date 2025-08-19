package prac.basics.java.codes.multithreading;

public class InterThreadSynchronization {

    public static void main(String[] args) {

        ThreadSynchronization ts = new ThreadSynchronization();

        Runnable r1 = () ->{
            try {
                ts.method(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r2 = () -> {
            try {
                ts.method(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();


    }
}


class ThreadSynchronization {

    synchronized void method(int n) throws InterruptedException {
        for(int i=1;i<=5;i++){

                System.out.println(i*n + " printed by " + Thread.currentThread().getName());
                Thread.sleep(5000);

        }
    }

}
