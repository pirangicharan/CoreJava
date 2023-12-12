package org.ramcharan.equalsoperatorandmethod;

public class EqualsOperNMeth {

    // '==' operator checks if both the Strings are pointing to same reference or not.
    // '==' operator checks memory allocation is same or different.
    // 'equals()' method checks content comparison.
    // '==' -> reference (memory sharing)
    // 'equals()' -> content comparison
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String A = new String("Hello");
        String B = new String("Hello");
        StringBuilder k = new StringBuilder("Hello");
        StringBuilder p = new StringBuilder("Hello");
        StringBuffer K = new StringBuffer("Hello");
        StringBuffer P = new StringBuffer("Hello");

        // All the above contents are same i.e, "Hello".
        // So when equals() is used, the result is 'true'.
        // But when '==' is used, comparing a,b only gets true.
        // Because variables with same content share same memory or reference.
        // But when 'new' is used, each 'new' have different references.

        System.out.println((a == b) + " : a == b"); // same reference
        System.out.println((a.equals(b)) + " : a.equals(b)" + "\n"); // same content

        System.out.println((a == A) + ": a == A"); // different reference
        System.out.println((a.equals(A)) + " : a.equals(A)" + "\n"); // same content

        System.out.println((A == B) + ": A == B"); // different reference
        System.out.println((A.equals(B)) + " : A.equals(B)" + "\n"); // same content

        System.out.println();

        // System.out.println(A == B);
    }
}
