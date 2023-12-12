package org.ramcharan.interviewcodingtests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumbers {

    public static void main(String[] args) {
        // Sort the list ascending or descending
        ArrayList<Integer> numbers = new ArrayList<>(List.of(45,3,78,87,76,2));

        System.out.println(numbers);

        // Looping from first index to last index ---->
        for (int i = 0; i < numbers.size(); i++){
            // Looping from last index to i <----
            // i---->i------>
            //        j<----j
            for (int j = numbers.size() - 1; j > i; j--){

                if (numbers.get(i) < numbers.get(j)){
                    int iNumber = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j,iNumber);
                }
            }
        }

        System.out.println("Sorted list : \n" + numbers);
        System.out.println("---------------------------");

        // Using Collections.sort()
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(31,6,454,89,34,87));
        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2);
    }
}
