package org.ramcharan.strings;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {

        String name = "Ram";

        String concat = name.concat("-Charan-Tej");
        String[] stringArray = concat.split("-");
        String join = String.join("_", stringArray);
        System.out.println("name  : " + name + "\n"
                        + "concat: " + concat + "\n"
                        + "split-: " + Arrays.toString(stringArray) + "\n"
                        + "join_ : " + join
                );
        /*
         How to convert arrays to List?

         Arrays.asList(stringArray);
         List.of(stringArray);
         */


        String[] stringArray2 = {"Ram","Charan", "Is","A","Good","Boy"};
        String join2 = String.join("-",stringArray2);
        System.out.println("\n" + "Array: " + Arrays.toString(stringArray2)
                            + "\n" + "join2: " + join2);

        String name2 = "012345678";
        int length = name2.length();
        String valueOf = String.valueOf(name2.toCharArray(), 2, 3);
        String valueOf1 = String.valueOf(2); // Here 2 is int which is converted to String.
        String valueOf2 = String.valueOf('6'); // Here 6 is char which is converted to String.
        System.out.println("\n" + "name : " + name2
                + "\n" + "length: " + length
                + "\n" + "ValueOf(off2-count3) : " + valueOf
                + "\n" + "ValueOf1: " + valueOf1
                + "\n" + "ValueOf2: " + valueOf2
        );

        // formatters.
        String stringFormat = String.format("%4s", "1"); // %4s works on string "1".
        String stringFormat2 = String.format("%4d", 1); // %4d works on numbers.
        String stringFormat3 = String.format("%04d", 1);
        String stringFormat4 = String.format("%.2f", 1.0000000);
        System.out.println("\n" + "format(''%4s'',''1''): " + stringFormat + "\n"
                            + "format2(''%4d'', 1)  : " + stringFormat2 + "\n"
                            + "format3(''%04d'', 1) : " + stringFormat3 + "\n"
                            + "format4('%.2f',1.000): " + stringFormat4 + "\n"
                            );

    }
}
