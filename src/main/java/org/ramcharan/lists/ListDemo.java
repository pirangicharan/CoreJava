package org.ramcharan.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    // List is Immutable. It should be converted to LinkedList or ArrayList to make it mutable.
    public static void main(String[] args) {

        List<Integer> a = List.of(23,5,6);

        System.out.println(a + " , size:" + a.size());
        System.out.println("0th index element: " + a.get(0));

        // a.add(0,0); // cannot be added.
        // a.set(0,0); // cannot be modified.

        ArrayList<Integer> b = new ArrayList<>(a);

        System.out.println(b);

    }
}
