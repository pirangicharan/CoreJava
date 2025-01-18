package org.ramcharan.operators;

public class TernaryOperators {

    public static void main(String[] args) {

        int a = 50, b = 40, c = 30, d = 80;

        // condition ? if-true : if-false

        // comparing 2 elements
        var result0 = (a > b) ? a : b ;
        System.out.println(result0);

        // comparing 3 elements
        var result1 = (a > b) ? (a > c) ? a : (b > c) ? b : c : d;

        System.out.println(result1);

        var result2 = (a > b) ? Math.max(a, c) : Math.max(b, c);
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

        String name = "Ram";
        String lastName = "Cherry"; // or "Charan" or any other value

        String result = name.equals("Ram")
                ? (lastName.equals("Cherry")
                    ? "RamCherry"
                    : (lastName.equals("Charan")
                        ? "RamCharan"
                            : "your first name is Ram"))
                : "not matching";

        System.out.println("result = " + result);



    }
}
