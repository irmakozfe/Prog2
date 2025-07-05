package klausurvorbereitung.twotter;

import java.io.*;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    private static final String FILE_NAME= "user.dat";

    @Override
    public void serialize(List<User> users){
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(users);


        }catch(IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public List<User> deserialize(){
        try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(FILE_NAME))){
            return (List<User>) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }

    }

}
