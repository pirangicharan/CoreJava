package org.ramcharan.equalsandhashcode;

import java.util.*;

public class SampleHashCode {
    public static void main(String[] args) {

       Fruit mango = new Fruit("Mango","Yellow");
       Fruit apple = new Fruit("Apple", "Red");
       Fruit orange = new Fruit("Orange", "Orange");
       Fruit guava = new Fruit("Mango","Yellow");

       List<Fruit> fruitsList = List.of(guava,apple,orange,mango);
       fruitsList.forEach(s -> System.out.println(s + " : " + s.hashCode()));

       Set<Fruit> fruitsSet = new HashSet<>();
       for (Fruit c : fruitsList){
           if (!(fruitsSet.add(c))){
               // If hashcode is same, duplications will be found.
               System.out.println("Duplicate found for " + c);
           }
       }

        System.out.println(fruitsSet);
    }
}
