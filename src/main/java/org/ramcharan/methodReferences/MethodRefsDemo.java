package org.ramcharan.methodReferences;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodRefsDemo {

    public static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"Ram","Sam","Sai","Jay","Sri"};
        List<UnaryOperator<String>> stringOperators
                = new ArrayList<>(List.of(
                        String::toUpperCase,
                        String::toLowerCase,
                        s -> s += " " + getRandomChar('D','S') + '.',
                        s -> s += " " + reverse(s,0,s.indexOf(' ')),
                        MethodRefsDemo::reverse

                ));
        applyChanges(names,stringOperators);
    }

    public static Character getRandomChar(char startChar, char endChar){
        return (char) random.nextInt(startChar,endChar);
    }

    public static void applyChanges(String[] names, List<UnaryOperator<String>> stringOperators){
        List<String> list = Arrays.asList(names);
        for(var operation : stringOperators){
            list.replaceAll(s -> s.transform(operation));
            System.out.println(Arrays.toString(names));
        }
    }
    public static String reverse(String name, int start, int end){
        return new StringBuilder(name.substring(start,end))
                .reverse().toString();
    }
    public static String reverse(String name){
        return reverse(name,0,name.length());
    }
}
