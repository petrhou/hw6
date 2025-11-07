public class Cache<T> {
    private final Object[] items;
    private final int maxSize;
    private int size;
    private int startIndex;

    public Cache(int maxSize) {
        this.maxSize = maxSize;
        this.items = new Object[maxSize];
        this.size = 0;
        this.startIndex = 0;
    }
}