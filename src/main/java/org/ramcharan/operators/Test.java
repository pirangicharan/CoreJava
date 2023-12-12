package org.ramcharan.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(23,45,87,27,79,94));
        System.out.println(list);

        list.set(0,1);
        System.out.println(list);
    }

}
