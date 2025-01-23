package org.ramcharan.interviewcodingtests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConcatWithoutRepeat {
    // Array of words = words, size of Array = N

    public static void main(String[] args) {
        String[] words = { "ab", "ac", "cd", "ef",  "gh"};
        System.out.println(longestNonRepeatWord(5,words));
    }
    public static int longestNonRepeatWord(int N, String[] words){
        Set<Character> charSet = new HashSet<>(); // Create a Set
        String finalResult = ""; // If charSet doesn't find any duplicate letters from the string, concat to 'finalResult'.
        int result; // Store length of finalResult in 'result'
        int count = 0; // Count the no.of times letters are added to charSet from a String.

        for (int i = 0; i<N; i++){ // Loop for words array

            for (int j =0; j<words[i].length(); j++){ // Loop for the String
                if (charSet.add(words[i].charAt(j))){ // Duplicate letters are not allowed in charSet
                    count++;
                }
            }

            if (words[i].length() == count){ // Add the word to finalResult only if the no.of letters are equal to the count.
                finalResult += words[i];
            }

            count = 0;

        }
        result = finalResult.length();
        System.out.println("Array: " + Arrays.toString(words));
        System.out.println(finalResult);
        return result;

    }


}
