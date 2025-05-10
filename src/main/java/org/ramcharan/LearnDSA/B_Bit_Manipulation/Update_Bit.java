package org.ramcharan.LearnDSA.B_Bit_Manipulation;

public class Update_Bit {
    // set bit to 1. -> Set_Bit
    // set bit to 0. -> Clear_Bit
    public static void main(String[] args) {
        // set bit to 1. -> Set_Bit
        System.out.println("Update bit to 1 -> Set_Bit");
        set_Bit(12,1);
        System.out.println("-----------------");
        System.out.println("Update bit to 0 -> Clear_Bit");
        clear_Bit(12,2);

    }

    public static void set_Bit(int n, int position){
        System.out.println(n + " -> " + Integer.toBinaryString(n));
        int bitMask = 1<<position; //0010
        System.out.println("01 -> " + Integer.toBinaryString(bitMask));
        int result = bitMask | n;
        System.out.println(result + " -> " + Integer.toBinaryString(result));
    }
    public static void clear_Bit(int n, int position){
        System.out.println(n + " -> " + Integer.toBinaryString(n));
        int bitMask = 1<<position; //0010
        System.out.println("01 -> " + Integer.toBinaryString(bitMask));
        int notBitMask = ~bitMask;
        System.out.println("01 -> " + Integer.toBinaryString(notBitMask));
        int result = notBitMask & n;
        System.out.println(result + " -> " + Integer.toBinaryString(result));
    }
}
