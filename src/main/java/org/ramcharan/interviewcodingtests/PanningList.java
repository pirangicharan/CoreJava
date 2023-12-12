package org.ramcharan.interviewcodingtests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PanningList {

    public static void main(String[] args) {
        // Given list    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //  Pan the list [9, 0, 1, 2, 3, 4, 5, 6, 7, 8]
        ArrayList<Integer> numbers = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);

        //myList(numbers);
        myList(numbers,1);

        System.out.println("------------------------------");
        // inbuilt method in Collections i.e., Collections.rotate()
        List<Integer> numbers2 = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        System.out.println(numbers2);
        Collections.rotate(numbers2, 1);
        System.out.println(numbers2);
    }
    private static void myList(ArrayList<Integer> anyList) {
        int a;
        int b;
        for (int i = anyList.size()-1; i > 0; i--) {
            a = anyList.get(i-1);
            b = anyList.get(i);

            a = a^b;
            b = a^b;
            a = a^b;

            anyList.set(i-1,a);
            anyList.set(i,b);
        }
        System.out.println(anyList);
    }

    private static void myList(ArrayList<Integer> anyList, int offset){
        if (offset != 0){
            for (int i = 0; i<= offset-1; i++){
                myList(anyList);
            }
        }
        else {
            System.out.println(anyList);
        }
    }
}
