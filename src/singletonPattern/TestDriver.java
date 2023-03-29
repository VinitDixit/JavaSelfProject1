package singletonPattern;

import java.io.*;
import java.util.Base64;

public class TestDriver {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingletonInstance();
        //Serialize singleton instance
        String serializedObj = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream outputStream = new ObjectOutputStream(baos)) {
            outputStream.writeObject(instance1);
            serializedObj = Base64.getEncoder().encodeToString(baos.toByteArray());
            System.out.println(serializedObj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialize
        byte[] decodedArray = Base64.getDecoder().decode(serializedObj);
        Object deserializedObj = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(decodedArray);
             ObjectInputStream inputStream = new ObjectInputStream(bais)) {
            deserializedObj = inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        Singleton instance2 = Singleton.getSingletonInstance();
        Singleton instance3 = (Singleton) deserializedObj;

        System.out.println("Hashcode of instance1::" + instance1.hashCode());
        System.out.println("Hashcode of instance3::" + instance3.hashCode());
    }
}
