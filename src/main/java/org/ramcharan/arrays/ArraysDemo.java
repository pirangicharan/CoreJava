package org.ramcharan.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //Declaration type 1
        int[] intArray1 = new int[10];
        intArray1[5] = 30;
        System.out.println("Array1: " + Arrays.toString(intArray1));

        //Declaration type 2
        int[] intArray2 = {0,1,2,3,4,5,6,7,8,9};
        intArray2[0] = 10;
        System.out.println("Array2: " + Arrays.toString(intArray2));

        int[] ints = Arrays.copyOfRange(intArray2, 7, 10);
        System.out.println("Array2: " +  Arrays.toString(ints));

        //Declaration type 3. This is not recommended.
        int intArray3[] = {10,20,30,40,50};
        System.out.println("Array3: " + Arrays.toString(intArray3));

        //Declaration type 4
        String[] stringArray1 = new String[] {"Ram","Shiva","Brahma"};
        System.out.println("stringArray1: " + Arrays.toString(stringArray1));

        //Declaration type 5. Out of declaration box can be initialised using 'new' keyword.
        String[] stringArray2;
        stringArray2 = new String[] {"Brahma","Vishnu","Maheshwara"};
        System.out.println("stringArray2: " + Arrays.toString(stringArray2));



        Arrays.fill(intArray2, 10);
        System.out.println("Array2 fill: " + Arrays.toString(intArray2));

        Arrays.setAll(intArray2, i -> i+1);
        System.out.println("Array2 setAll: " + Arrays.toString(intArray2));




    }
}
