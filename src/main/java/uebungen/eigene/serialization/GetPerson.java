package uebungen.eigene.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/serialization/person.dat"));
        Person p = (Person) ois.readObject();
        ois.close();

        System.out.println(p);
    }
}
