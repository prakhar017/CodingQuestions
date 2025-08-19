package prac.basics.java.codes.multithreading;

public class DeadlockExampleThread {

    public static void main(String[] args) {


        final String name1 = "Prakhar";
        final String name2 = "Anupam";


        Thread t1 = new Thread(() -> {

            synchronized (name1) {
                System.out.println(name1);


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (name2) {
                    System.out.println(name2);
                }
            }

        });


        Thread t2 = new Thread(() -> {

            synchronized (name2) {
                System.out.println(name2);


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (name1) {
                    System.out.println(name1);
                }
            }

        });

        t1.start();
        t2.start();


    }
}
