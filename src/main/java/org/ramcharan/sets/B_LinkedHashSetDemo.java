package org.ramcharan.sets;

import java.util.*;


public class B_LinkedHashSetDemo {

    // Duplicates are removed.
    // There is Insertion order so no sorting.
    // Searching any element takes same time regardless of it's size.i.e, O(1).
    // LinkedHashSet is faster than TreeSet but little slower than HashSet.
    // All the methods in HashSet works in the same way for TreeSet.
    // Searching with index is impossible.
    // Allows null objects.
    // Not Thread safe.

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>(List.of("Ram", "Charan", "charan", "Anania", "Jay"));
        System.out.println("TreeSet " + treeSet);

        Set<String> linkedHashSet = new TreeSet<>(List.of("Ram", "Charan", "charan", "Anania", "Jay"));
        System.out.println("LinkSet " + linkedHashSet);

        // Insertion Order.
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Ram");
        stringSet.add("Charan");
        stringSet.add("charan");
        stringSet.add("Anania");
        stringSet.add("Jay");
        stringSet.add(null); // LinkedHashSet allows Nulls.
        System.out.println("LinkSet " + stringSet);

        stringSet.remove("Jay");
        System.out.println("LinkSet " + stringSet);


    }
}
