package org.ramcharan.sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A_HashSetDemo {

    // Duplicates are removed.
    // No guarantee of insertion order or sorting.
    // HashSet is faster.
    // Searching any element takes same time regardless of it's size.i.e, O(1).
    // Searching with index is impossible.
    // Allows null values.

    public static void main(String[] args) {

        // No Insertion Order, No Sorting.
        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Ram");
        stringHashSet.add("Charan");
        stringHashSet.add("charan");
        stringHashSet.add("Anania");
        stringHashSet.add("Jay");
        stringHashSet.add(null); // HashSet allows Nulls.
        System.out.println(stringHashSet);



        Set<String> stringHashSet1 = new HashSet<>(List.of("Ram", "Charan", "charan", "Anania", "Jay"));
        System.out.println(stringHashSet1);

        // remove() don't ask for index.
        stringHashSet1.remove("Jay");
        System.out.println(stringHashSet1);


    }


}
