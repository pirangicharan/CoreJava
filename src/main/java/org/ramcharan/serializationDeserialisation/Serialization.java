package org.ramcharan.serializationDeserialisation;

import org.ramcharan.streams.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {

        // Create an object of Employee.
        // Note: Employee class must implement Serializable interface
        Employee serialize = new Employee(302, "Ram", 29, "Male", "Food", 1995, 0.0);

        try {
            // Give the location to store the file with name 'Serialized.ser'
            FileOutputStream out = new FileOutputStream("E:\\Serialized.ser");
            // create object in the above file.
            ObjectOutputStream obj = new ObjectOutputStream(out);
            // Write the object in it.
            obj.writeObject(serialize);

            // Close obj and out
            obj.close();
            out.close();
            System.out.println("Success");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}