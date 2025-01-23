package org.ramcharan.interviewcodingtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatedLettersInStringArray {
    public static void main(String[] args) {
        String[] str = {"apple","banana","cherry"}; // output: ale,b,chey
        for (String s : str) {
            StringBuilder nonDups = new StringBuilder();
            HashSet<Character> characterList = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if(!nonDups.toString().contains(String.valueOf(s.charAt(i)))){
                    nonDups.append(s.charAt(i));
                }
                else {
                    characterList.add(s.charAt(i));
                }
            }
            // Remove characterList letters from nonDups.
            for (Character c : characterList) {
                int index = nonDups.indexOf(String.valueOf(c));
                nonDups.deleteCharAt(index);
            }

            System.out.println(nonDups);
            System.out.println(characterList);
        }
    }
}
