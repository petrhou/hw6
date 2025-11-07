public class CacheTest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);
        
        cache.add("Apple");
        cache.add("Banana");
        cache.add("Cherry");
        
        cache.add("Date");
        
        System.out.println(cache.exists("Banana"));
        System.out.println(cache.exists("Apple"));
        
        System.out.println(cache.getFirst());
        System.out.println(cache.getLast());
        
        System.out.println(cache.getItemByIndex(0));
        System.out.println(cache.getItemByIndex(1));
        System.out.println(cache.getItemByIndex(2));
        
        System.out.println(cache.remove("Banana"));
        System.out.println(cache.remove("Mango"));
        
        Cache<Integer> numbers = new Cache<>(2);
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
    }
}