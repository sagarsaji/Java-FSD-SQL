package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializabkenonserializable {
    public static void main(String[] args) {
        Student sasi = new Student("sasi",1);
        String filename = "D://filename.txt";

        // Serialize the object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sasi);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        Student deserializedPerson = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedPerson = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Verify the deserialized object
        System.out.println("Deserialized Person: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge());
    }
}