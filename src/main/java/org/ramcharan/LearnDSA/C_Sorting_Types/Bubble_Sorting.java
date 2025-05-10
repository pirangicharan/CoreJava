package org.ramcharan.LearnDSA.C_Sorting_Types;

import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {

        int[] arr = {7,8,2,1,3};
        int count = 0;
        // iterate n-1 elements.
        for (int i = 0; i < arr.length-1; i++){
            // compare two corresponding elements.
            for (int j = 0; j < arr.length-i-1; j++){
                // swap big number to right.
                // so that big number will come to the last index.
                // No need to check with last number in next iteration. Hence, j < (n-1)-i.
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
                System.out.println(Arrays.toString(arr) + " <- " + count);
            }
            count = 0;
            System.out.println("------------");
        }
        System.out.println(Arrays.toString(arr));
    }
}
