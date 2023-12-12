package org.ramcharan.functionalInterfaces;

@FunctionalInterface
interface Operation<T>{
    // 1.Only one abstract method is allowed in the functional Interface.
    // So that it can be used by lambdas.
    T calculate(T value1, T value2);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // 2.Use Functional Interface for lambdas.
        Operation<Integer> sum = (value1, value2) -> value1 + value2; // Declaring logic
        System.out.println("sum = " + sum.calculate(10,5)); // Giving values and printing

        Operation<String> stringConvert = (value1, value2) -> value1.toUpperCase() +" " + value2.toUpperCase();
        System.out.println("stringConvert = " + stringConvert.calculate("ram","charan"));

        // 4.Now use calculation method to combine use of functional interface with its parameters.
        Integer calculation = calculation((a, b) // As per functional Interface, calculate(a,b).
                                                -> a + b, // our own logic
                                                        4, // a
                                                        2 // b
                                                        );
        System.out.println(calculation);
        String calculation2 = calculation((a,b)
                                            -> a.toUpperCase() + " " + b.toUpperCase(),
                                        "ram","charan");
        System.out.println(calculation2);

    }

    // 3.A method to define parameters of calculate method from Operation<T> interface.
    public static <T> T calculation(Operation<T> value, T value1, T value2){

        return value.calculate(value1, value2);

    }
}
