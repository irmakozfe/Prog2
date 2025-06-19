package uebungen.eigene.gpt.fotokopieren;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Kopieren {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/gpt/fotokopieren/profil.png");
            FileOutputStream fos= new FileOutputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/gpt/fotokopieren/backup.png")
        ){
            byte[] buffer = new byte[4096];
            int byteRead;

            while((byteRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, byteRead);

            }
            System.out.println("Foto ist kopiert");
        } catch (IOException e){
            e.printStackTrace();
        }

    }





}
