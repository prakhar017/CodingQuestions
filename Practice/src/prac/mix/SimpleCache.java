package prac.basics.mix;

import prac.basics.mix.CacheEntry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleCache {

    private ConcurrentHashMap<Integer, CacheEntry> cache = new ConcurrentHashMap<>();

    public void put(int key, int value, Long time) {
        cache.put(key, new CacheEntry(value, time));
    }


    public Integer get(int key) {
        CacheEntry cacheEntry = cache.get(key);

        if (cacheEntry == null) {
            return null; // key not present
        }

        if (cacheEntry.isExpired()) {
            cache.remove(key);
            return null;

        } else
            return cacheEntry.value;
    }

    public void remove(int key) {
        cache.remove(key);
    }


    public void cleanup() {
        for (Map.Entry<Integer, CacheEntry> entry : cache.entrySet()) {
            if (entry.getValue().isExpired()) {
                cache.remove(entry.getKey());
            }
        }

    }

}

