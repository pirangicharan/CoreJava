package org.ramcharan.operators;

import java.util.ArrayList;
import java.util.List;

public class XorOperator {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        // Using XOR operator(^)
        // XOR store a calculated bitwise XOR of 2 numbers.
        // a^b or b^a are same.
        // 0^a = a.
        // a^a = 0.

        a = a ^ b; // 1^2 is 3. so a=3.
        b = a ^ b; // 3^2 is 1. so b=1.
        a = a ^ b; // 3^1 is 2. so a=2.
        System.out.println("a = " + a + ", " + "b = " + b);

        a = 11; b = 24; c = 66;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        a = a^b^c; // 11^24^66 = 81. a = 81.
        b = a^b^c; // 81^24^66 = 11. b = 11.
        c = a^b^c; // 81^11^66 = 24. c = 24.
        a = a^b^c; // 81^11^24 = 66. a = 66.
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);

        //myList(numbers);
        listWithOffset(numbers,1);
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

    private static void listWithOffset(ArrayList<Integer> anyList, int offset){
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
