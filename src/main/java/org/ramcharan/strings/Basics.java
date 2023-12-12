package org.ramcharan.strings;

public class Basics {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";

        String A = new String("Hello");
        String B = new String("Hello");

        StringBuilder k = new StringBuilder("Hello");
        StringBuilder p = new StringBuilder("Hello");

        StringBuffer K = new StringBuffer("Hello");
        StringBuffer P = new StringBuffer("Hello");

        System.out.println(a == b);
        System.out.println(a.equals(b) + "\n");

        System.out.println(A == B);
        System.out.println(A.equals(B));

        // System.out.println(A == B);

    }
}
