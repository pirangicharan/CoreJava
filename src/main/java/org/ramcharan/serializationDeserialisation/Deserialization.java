package org.ramcharan.serializationDeserialisation;

import org.ramcharan.streams.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            // Give the location of the file.
            FileInputStream in = new FileInputStream("E:\\Serialized.ser");
            // Generate the object reader.
            ObjectInputStream obj = new ObjectInputStream(in);
            // Cast the readObject as Employee.
            Employee employee = (Employee) obj.readObject();
            // Close the opened files.
            obj.close();
            in.close();
            // Print the read Object.
            System.out.println(employee.toString());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
