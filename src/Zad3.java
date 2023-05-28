import java.util.ArrayList;
import java.util.LinkedList;

public class Zad3{

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Dodawanie 10 000 elementów na początek listy - ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;
        System.out.println("Czas dodawania 10 000 elementów na początek ArrayList: " + arrayListAddTime + " ns");
        // Dodawanie 10 000 elementów na początek listy - LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.addFirst(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;
        System.out.println("Czas dodawania 10 000 elementów na początek LinkedList: " + linkedListAddTime + " ns");

    }

