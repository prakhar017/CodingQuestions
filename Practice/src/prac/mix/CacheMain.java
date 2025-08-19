package prac.basics.mix;

public class CacheMain {

    public static void main(String[] args) throws InterruptedException {


        SimpleCache cache = new SimpleCache();

        cache.put(1, 100, 3000L); // Key=1, Value=100, TTL=3 seconds
        cache.put(2, 200, 1000L); // Key=2, Value=200, TTL=1 second

        System.out.println("Get key 1: " + cache.get(1)); // Should print 100
        System.out.println("Get key 2: " + cache.get(2)); // Should print 200

        Thread.sleep(1500);

        System.out.println("After 1.5 sec, key 2: " + cache.get(2)); // Should be null
        System.out.println("Before cleanup, key 1: " + cache.get(1)); // Still 100

        cache.cleanup(); // This will remove any expired keys (e.g., key 2)

        System.out.println("After cleanup, key 2: " + cache.get(2)); // null
        System.out.println("Final key 1: " + cache.get(1)); // Still 100

    }
}
