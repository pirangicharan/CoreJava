package org.ramcharan.equalsandhashcode;

public class equalsAndHashCode {
    public static void main(String[] args) {

        // MyObject has 2 fields.
        // So equals method is override to compare all the fields.
        MyObject test1 = new MyObject(10,20);
        MyObject test2 = new MyObject(10,20);
        //printing hashCodes for both objects.
        System.out.println(test1+ " " + test1.hashCode());
        System.out.println(test2+ " " + test2.hashCode());
        if(test1.equals(test2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }


        // Here Integer has 1 value in it. No need to override equals method.
        Integer a = 3;
        Integer b = 3;
        System.out.println("a : " + a.hashCode());
        System.out.println("b : " + b.hashCode());
        if (a.equals(b)) {
            System.out.println("a = b");
        }else System.out.println("a != b");

        if (b == a) {
            System.out.println("a and b point to same reference");
        }else System.out.println("different reference");


    }
}
