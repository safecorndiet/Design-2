// Time Complexity : o(1)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MyHashSet {
    private int numBuckets;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        numBuckets = 1000;
        buckets = new LinkedList[numBuckets];
    }

    private int hash(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucket = hash(key);
        if (buckets[bucket] == null) {
            buckets[bucket] = new LinkedList<>();
        }
        if (!buckets[bucket].contains(key)) {
            buckets[bucket].add(key);
        }
    }

    public void remove(int key) {
        int bucket = hash(key);
        if (buckets[bucket] != null) {
            buckets[bucket].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int bucket = hash(key);
        if (buckets[bucket] != null) {
            return buckets[bucket].contains(key);
        }
        return false;
    }
}
