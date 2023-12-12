package org.ramcharan.operators;

public class TernaryOperators {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;

        // condition ? if-true : if-false

        // comparing 2 elements
        var result0 = (a > b) ? a : b ;

        // comparing 3 elements
        var result1 = (a > b) ? // 1st condition
                        (a > c) // sub condition (comes here if 1st is satisfied.)
                                ? a : c
                            : (b > c) // 2nd condition (comes here if 1st is not satisfied.)
                                ? b : c ;


        var result2 = (a > b) ? Math.max(a, c) : Math.max(b, c);

        System.out.println(result1);
        System.out.println(result2);

        a = 40; b = 10; c = 50;

        var result3 = (a > b) ?
                        (a > c) ? a : c
                            : (b > c) ? b : c ;

        System.out.println(result3);
        a = 0;

        a = b++ + c;
        // the above expression can be classified as
        // a becomes b + c,
        // b becomes b++,
        // c remains as c.

        System.out.println(a + "  " + b + "  " + c);

        a = 1; b = 2; c = 10;

        System.out.println("a = " + a + ", " + "b = " + b);



    }
}
