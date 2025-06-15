package uebungen.eigene.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePerson {
// Serialisierung
    public static void main(String[] args) {
        try{
            Person p = new Person("Max Tremel", 25);
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/serialization/person.dat"));
            oos.writeObject(p);
            oos.close();
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
