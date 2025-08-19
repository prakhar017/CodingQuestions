package prac.basics.java.codes.designpatterns;

import java.io.Serial;
import java.io.Serializable;

public class Singleton_Logger implements Serializable, Cloneable {

    /*• The volatile keyword ensures that when one thread updates the instance, it’s visible to all other threads.
    This prevents any threads from getting an outdated version of the Logger object.*/
    private static volatile Singleton_Logger logger;


    /*Reflection can make the constructor accessible:


    Constructor<Logger> constructor = Logger.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Logger logger2 = constructor.newInstance();
    → New instance created.

    Fix:
    Inside constructor:*/

    private Singleton_Logger(){
        if (logger != null) {
            throw new RuntimeException("Use getLogger() method!");
        }

    }


    public Singleton_Logger getLogger(){
        if(logger == null){

            synchronized (Singleton_Logger.class){
                if( logger == null)
                    logger = new Singleton_Logger();
            }

        }
        return logger;

    }


/*  If the Singleton implements Cloneable:

    Logger logger2 = (Logger) logger1.clone();

    New object created.   Fix: Override clone():*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }


/*  If your Singleton implements Serializable, serialization can create a new object when you deserialize it — breaking Singleton.

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("logger.ser"));
    oos.writeObject(Logger.getInstance());

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("logger.ser"));
    Logger logger2 = (Logger) ois.readObject();

    System.out.println(logger2 == Logger.getInstance()); // false ❌


    Fix:
    Implement readResolve():*/

    // Method to maintain singleton property during deserialization



    /*  @Serial does not enforce singletoncy.

        readResolve() enforces singletoncy.

       @Serial makes sure your readResolve() method actually works
       By ensuring its signature matches the serialization contract — preventing subtle bugs.*/
    @Serial
    protected Object readResolve() {

        return getLogger();
    }
}


