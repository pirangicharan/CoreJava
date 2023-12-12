package org.ramcharan.sets;

import java.util.*;



public class B_TreeSetDemo {

    // Duplicates are removed.
    // elements are Sorted.
    // Searching any element takes same time regardless of it's size.i.e, O(1).
    // TreeSet is slower than HashSet.
    // All the methods in HashSet works in the same way for TreeSet.
    // Searching with index is impossible.
    // Nulls are not allowed.

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>(List.of("K","A","D","C","C","F","BA","BB"));
        System.out.println(treeSet);

        TreeSet<Integer> treeSet1 = new TreeSet<>(List.of(4,6,8,2,1,1,9,6,6,5));
        System.out.println(treeSet1);
        // If you want in reverse order:
        List<Integer> list = treeSet1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);

        // Sorted.
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Ram");
        stringSet.add("Charan");
        stringSet.add("charan");
        stringSet.add("Anania");
        stringSet.add("Jay");
     // stringSet.add(null);  // TreeSet don't allow Nulls.
        System.out.println(stringSet);

        stringSet.remove("Jay");
        System.out.println(stringSet);
    }
}
