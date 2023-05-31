class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Zad2 {
    public static void main(String[] args) {
        Counter counter = new Counter();


    }
}