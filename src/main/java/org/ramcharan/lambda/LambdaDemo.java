package org.ramcharan.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaDemo {
    public static void main(String[] args) {
        // This is by using Anonymous method.
        Consumer<String> printTheParts = new Consumer<>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part :
                        parts) {
                    System.out.println(part);
                }
            }
        };

        printTheParts.accept("This is By using Anonymous method");

        Consumer<String> printPartsWithLambda = sentence ->
                                Arrays.stream(sentence.split(" "))
                                        .forEach(System.out::println);
        printPartsWithLambda.accept("This is with Lambda");

        UnaryOperator<String> lambda2 = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++){
                if (i%2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };


    }
}
