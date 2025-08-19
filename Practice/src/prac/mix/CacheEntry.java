package prac.basics.mix;

public class CacheEntry {

    public int value;
    public long expirytime;


    CacheEntry(int value, Long expirytime) {
        this.value = value;
        this.expirytime = System.currentTimeMillis() + expirytime;
    }


    public boolean isExpired() {
        return System.currentTimeMillis() > expirytime ? true : false;
    }
}
