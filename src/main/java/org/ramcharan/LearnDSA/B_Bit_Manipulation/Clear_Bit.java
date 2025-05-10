package org.ramcharan.LearnDSA.B_Bit_Manipulation;

public class Clear_Bit { // set bit to 0.
    public static void main(String[] args) {

        int n = 12;
        int position = 2;
        System.out.println(n + " -> " + Integer.toBinaryString(n) + ", clear bit at " + position);
        // 1.Create a bitmask with 1 and LeftShift with position.
        int bitMask = 1<<position;
        System.out.println(0001 + " -> " + Integer.toBinaryString(bitMask));
        // 2.Complement the bitMask to get 0 at required position.
        int notBitMask = ~bitMask;
        System.out.println(Integer.toBinaryString(bitMask) + " -> " + Integer.toBinaryString(notBitMask));
        // 3.Now do notBitMask & n. (1 & 1 = 1, remaining = 0)
        int result = notBitMask & n;
        System.out.println(result + " -> " + Integer.toBinaryString(result));

    }

}
