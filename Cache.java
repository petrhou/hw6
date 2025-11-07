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

    public void add(T item) {
        if (size < maxSize) {
            items[(startIndex + size) % maxSize] = item;
            size++;
        } else {
            items[startIndex] = item;
            startIndex = (startIndex + 1) % maxSize;
        }
    }

    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            int index = (startIndex + i) % maxSize;
            if (items[index].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    int currentIndex = (startIndex + j) % maxSize;
                    int nextIndex = (startIndex + j + 1) % maxSize;
                    items[currentIndex] = items[nextIndex];
                }
                items[(startIndex + size - 1) % maxSize] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean exists(T item) {
        for (int i = 0; i < size; i++) {
            int index = (startIndex + i) % maxSize;
            if (items[index].equals(item)) {
                return true;
            }
        }
        return false;
    }
}