package org.ramcharan.interviewcodingtests;

import java.util.*;

//Count duplicates without using inbuilt methods.
public class CountDuplicates {
    public static void main(String[] args) {
        myString("Ram is a good boy");
    }

    private static void myString(String string) {
        // Converting String to Character Array.
        char[] charArray = string.toCharArray();

        List<Character> charList = new ArrayList<>();
        // Adding Characters into List.
        for (Character c : charArray) {
            if (c != ' ') {
                charList.add(c);
            }
        }
        System.out.println(charList);

        // Creating a Set with elements in the list.
        Set<Character> charSet = new HashSet<>(charList);
        System.out.println(charSet);

        int count = 0;
        // Iterate each element in the set.
        for (Character c : charSet) {
            for (int i = 0; i < charList.size(); i++){
                // Comparing set element to each list element
                if (Objects.equals(c,charList.get(i))){
                    // Increment the count for each true.
                    count++;
                }
            }
            // Print the count.
            System.out.println(c + " = " + count);
            // Set count to 0 for next set element.
            count = 0;
        }
    }

}
