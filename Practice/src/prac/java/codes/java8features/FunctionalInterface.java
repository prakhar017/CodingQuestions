package prac.basics.java.codes.java8features;


@java.lang.FunctionalInterface
public interface FunctionalInterface {

    void show ();

    String toString ();
}

class Main5 {
    public static void main ( String args[]){


        FunctionalInterface functionalInterface = () -> System.out.println("Inside show using Lambda expression");

        functionalInterface.show();
    }
}
