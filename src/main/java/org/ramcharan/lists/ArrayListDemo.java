package org.ramcharan.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListDemo {

    // Good for retrieval operations.
    // Adding elements in between is very time-consuming for bigger data.
    // Insertion Ordered true.
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1,2,3,6,5,9));
        System.out.println(a);

        a.add(4,0);
        a.add(20);
        a.addLast(100);
        a.addFirst(0);
        System.out.println(a);

        a.set(4,null);
        a.set(5,null);
        System.out.println(a);

        int i = a.indexOf(null); // gives first repeated null.
        System.out.println("Index of null: " + i);

        System.out.println(a);
        a.remove(4);
        System.out.println(a + " -> Removed index 4.");
        a.removeFirst();
        a.removeLast();
        System.out.println(a + " -> Removed first and last indexes.");
        a.removeIf(n -> a.indexOf(n) % 2 == 0);
        System.out.println(a + " -> Removed even indexes.");

        boolean contains = a.contains(null);
        System.out.println("Contains null -> " + contains);

    }
}
