package prac.basics.java.codes.multithreading;

public class ThreadPractice extends Thread {

    public static void main(String[] args) {

        new Thread(){
            public void run(){
                System.out.println("From Annonymous class");
                System.out.println("Name of thread runnning " + Thread.currentThread().getName());
            }
        }.start();


        new Thread(() -> {
            System.out.println("From Thread -> Lambda");
            System.out.println("Name of thread runnning " + Thread.currentThread().getName());
        }).start();




        Runnable runnable = () -> {
            System.out.println("From Runnable -> Lambda -> Thread");
            System.out.println("Name of thread runnning " + Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);
        thread.start();



        ThreadPractice threadPractice = new ThreadPractice();
        threadPractice.start();


/*        new Thread(){
                     public  void run(){
                         System.out.println("Just revising, through annonymous class");
                     }
        }.start();


        new Thread(() -> {
            System.out.println(" From thread lambda");
        }).start();



        Runnable r = () -> {
            System.out.println("From runnable");
        };

        Thread th = new Thread(r);
        th.start();*/

    }


    public void run(){
        System.out.println("From ThreadPractice class");
        System.out.println("Name of thread runnning " + Thread.currentThread().getName());
    }
}


