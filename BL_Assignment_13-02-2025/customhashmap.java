import java.util.LinkedList;

class customhashmap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size;

    @SuppressWarnings("unchecked")
    public customhashmap() {
        buckets = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            Entry<K, V> current = buckets[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newEntry;
                    break;
                }
                current = current.next;
            }
        }
        size++;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = buckets[index];
        Entry<K, V> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public static void main(String[] args) {
        customhashmap<String, Integer> map = new customhashmap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'Two': " + map.get("Two"));
        map.remove("Two");
        System.out.println("Contains 'Two': " + map.containsKey("Two"));
        System.out.println("Size: " + map.size());
    }
}
