package Module4;

public class GarbageCollectionDemo {
    protected void finalize() {
        System.out.println("Garbage Collector called.");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
