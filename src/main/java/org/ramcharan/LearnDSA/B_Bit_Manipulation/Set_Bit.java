package org.ramcharan.LearnDSA.B_Bit_Manipulation;

public class Set_Bit { // set bit to 1.
    public static void main(String[] args) {

        int n = 12;
        int position = 0;
        System.out.println(n + " -> " + Integer.toBinaryString(n) + ", set bit at " + position);
        // 1.Create a bitmask with 1 and LeftShift with position.
        int bitMask = 1<<position;
        System.out.println(0001 + " -> " + Integer.toBinaryString(bitMask));

        //2.Now do bitMask | n (0 | 0 = 0, remaining = 1)
        int result = bitMask | n;
        System.out.println(result + " -> " + Integer.toBinaryString(result));
    }
}
