package org.ramcharan.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    // Good for adding elements in-between as it uses chain mechanism.
    // Bad for retrieval operations as it always starts iterating with 1st index.
    public static void main(String[] args) {

        List<Integer> b = new LinkedList<>(List.of(56,54,41,87,60,4));
        System.out.println(b + " -> " + b.size());

        System.out.println("get element in index 5 -> " + b.get(5));

        b.add(1);
        System.out.println(b + " -> added '1' without index.");
        b.add(2,2);
        System.out.println(b + " -> added '2' with index '2'.");
        b.addFirst(null);
        b.addLast(0);
        System.out.println(b + " -> added 'null' in first and '0' in last indexes.");

        System.out.println("contains null -> " + b.contains(null));

        b.remove(null);
        System.out.println(b + " -> removed object 'null'.");
        b.remove(2);
        System.out.println(b + " -> removed index '2'.");
        b.removeFirst();
        b.removeLast();
        System.out.println(b + " -> removed first and last indexes.");
        b.removeIf(n -> n % 2 == 0);
        System.out.println(b + " -> removed even numbers.");

    }
}
