
package lr9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program6 {
    public static void main(String[] args) {
        int ELEMENTS = 100000;
        int TRIES = 100;

        long arrayListAverage = 0;
        for (int j = 0; j < TRIES; ++j) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < ELEMENTS; ++i) {
                arrayList.add(i);
            }

            long startArrayList = System.nanoTime();
            while (arrayList.size() > 1) {
                int half = arrayList.size() / 2;
                for (int i = 0; i < half; ++i) {
                    arrayList.remove(i);
                }
            }
            long endArrayList = System.nanoTime();

            arrayListAverage += endArrayList - startArrayList;
        }
        System.out.println("[ArrayList] Avg. execution time: " + (arrayListAverage / TRIES) + " ns");

        long linkedListAverage = 0;
        for (int j = 0; j < TRIES; ++j) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            for (int i = 0; i < ELEMENTS; ++i) {
                linkedList.add(i);
            }

            long startLinkedList = System.nanoTime();
            while (linkedList.size() > 1) {
                int size = linkedList.size();
                int half = size / 2;
                for (int i = 0; i < half; ++i) {
                    linkedList.remove();
                    linkedList.add(linkedList.remove());
                }

                if (size % 2 == 1) linkedList.add(linkedList.remove());
            }
            long endLinkedList = System.nanoTime();

            linkedListAverage += endLinkedList - startLinkedList;
        }
        System.out.println("[LinkedList] Avg. execution time: " + (linkedListAverage / TRIES) + " ns");
    }
}
