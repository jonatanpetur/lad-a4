package lad_a4;

public class CountingFilterImpl implements CountingFilter {

    private int[] filter;

    /** Initiates a counting filter, the capacity indicates how much memory can be used
     * (memory usage must be O(capacity)) */
    public CountingFilterImpl(int capacity){
        filter = new int[capacity];
    }

    public void add(int e) {
        filter[e % filter.length]++;
    }

    public void add(Object e) {
        this.add(e.hashCode());
    }

    public int count(int e) {
        return filter[e % filter.length];
    }

    public int count(Object e) {
        return this.count(e.hashCode());
    }
    
    public void remove(int e) {
        filter[e % filter.length]--;
    }

    public void remove(Object e) {
        this.remove(e.hashCode());
    }
}