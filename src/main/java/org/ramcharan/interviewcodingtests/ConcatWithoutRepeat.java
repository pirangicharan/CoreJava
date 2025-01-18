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
        // Create a Set
        Set<Character> charSet = new HashSet<>();
        // If charSet doesn't find any duplicate letters from the string,
        // concat to 'finalResult'.
        String finalResult = "";
        // Store length of finalResult in 'result'
        int result;
        // Count the no.of times letters are added to charSet from a String.
        int count = 0;
        // Loop for words array
        for (int i = 0; i<N; i++){
            // Loop for the String
            for (int j =0; j<words[i].length(); j++){
                // Duplicate letters are not allowed in charSet
                if (charSet.add(words[i].charAt(j))){
                    count++;
                }
            }
            // Add the word to finalResult only if the no.of letters are equal to the count.
            if (words[i].length() == count){
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
