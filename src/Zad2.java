import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zad2{
        public static void main(String[] args) {
            final int NUM_ELEMENTS = 1000000;

            // ArrayList
            List<Integer> arrayList = new ArrayList<>();
            long arrayListAddTime = measureAddTime(arrayList, NUM_ELEMENTS);
            long arrayListRemoveTime = measureRemoveTime(arrayList);

        }
}
