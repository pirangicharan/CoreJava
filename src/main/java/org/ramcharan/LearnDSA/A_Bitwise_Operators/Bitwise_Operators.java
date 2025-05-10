package org.ramcharan.LearnDSA.A_Bitwise_Operators;

public class Bitwise_Operators {
    public static void main(String[] args) {

        int a = 12;
        int b = 9;
        System.out.println(a + " -> " + Integer.toBinaryString(a));
        System.out.println(String.format("%02d",b) + " -> " + Integer.toBinaryString(b));

        System.out.println();
        System.out.println("1 & 1 = 1, remaining = 0.");
        Bitwise_AND(a, b);

        System.out.println();
        System.out.println("0 | 0 = 0, remaining = 1.");
        Bitwise_OR(a,b);

        System.out.println();
        System.out.println("1 ^ 0 = 1, remaining = 0.");
        Bitwise_XOR(a,b);

        System.out.println();
        System.out.println("~1 = 0, ~0 = 1.");
        Bitwise_Complement(a);

        System.out.println();
        int c =15;
        System.out.println(c + " -> " + Integer.toBinaryString(b));
        System.out.println("<<----------------");
        Bitwise_LeftShift(c,1);
        Bitwise_LeftShift(c,2);
        Bitwise_LeftShift(c,3);
        Bitwise_LeftShift(c,4);
        System.out.println("---------------->>");
        Bitwise_RightShift(c,1);
        Bitwise_RightShift(c,2);
        Bitwise_RightShift(c,3);
        Bitwise_RightShift(c,4);

    }

    public static void Bitwise_AND(int a, int b){
        int c = a & b ; // 1 & 1 = 1, remaining = 0.
        System.out.println(a + " & " + b + " -> " + Integer.toBinaryString(c));
    }
    public static void Bitwise_OR(int a, int b){
        int c = a | b ; // 0 | 0 = 0, remaining = 1.
        System.out.println(a + " | " + b + " -> " + Integer.toBinaryString(c));
    }
    public static void Bitwise_XOR(int a, int b){
        int c = a ^ b ; // 1 ^ 0 = 1, remaining = 0.
        System.out.println(a + " ^ " + b + " -> " + Integer.toBinaryString(c));
    }
    public static void Bitwise_Complement(int a){
        int c = ~a; // ~1 = 0, ~0 = 1.
        System.out.println("~" + a + " -> " + Integer.toBinaryString(c));
    }
    public static void Bitwise_LeftShift(int a, int b){
        //   <------ offset to left by b.
        int c = a << b ;
        System.out.println(a + " << " + b + " -> " + Integer.toBinaryString(c));
    }
    public static void Bitwise_RightShift(int a, int b){
        //   ------> offset to left by b.
        int c = a >> b ;
        System.out.println(a + " >> " + b + " -> " + Integer.toBinaryString(c));
    }

}
