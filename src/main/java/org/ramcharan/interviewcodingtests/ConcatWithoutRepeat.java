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
        Set<Character> charSet = new HashSet<>();
        String finalResult = "";
        int result;
        int count = 0;
        for (int i = 0; i<N; i++){
            for (int j =0; j<words[i].length(); j++){
                if (charSet.add(words[i].charAt(j))){
                    count++;
                }
            }
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
