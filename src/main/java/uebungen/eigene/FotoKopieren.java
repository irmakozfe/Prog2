package uebungen.eigene;

import java.io.*;

public class FotoKopieren {

    public static void main(String[] args) {

        //try-with-resources: auto-close

        try(InputStream fis= new FileInputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/example.png");
            OutputStream fos = new FileOutputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/copy.png");
        ) {
            byte[] buffer = new byte[4096];
            int byteRead; //byte sayısı

            while((byteRead= fis.read(buffer)) != -1){
                fos.write(buffer, 0, byteRead); // yazmaya 0dan başla, byteRead tane byte yaz, buffer: bytelar burda
            }

            System.out.println("Copied");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
