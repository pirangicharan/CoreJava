package org.ramcharan.LearnDSA.B_Bit_Manipulation;

public class Get_Bit {
    public static void main(String[] args) {

        int a = 5;
        int position = 0;
        // 1.Create a bitmask with 1 and LeftShift with position.
        int bitMask = 1<<position;

        System.out.println(a + " -> " + Integer.toBinaryString(a) + ", Find bit at " + position);
        System.out.println(Integer.toBinaryString(1) + " -> " + Integer.toBinaryString(bitMask));

        //2.Now do bitMask & a (1 & 1 = 1, remaining = 0)
        if ((bitMask & a) == 0){
            System.out.println("bit was 0");
        }else {
            System.out.println("bit was 1");
        }
    }
}
