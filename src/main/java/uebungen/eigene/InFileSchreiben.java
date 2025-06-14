package uebungen.eigene;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InFileSchreiben{
    public static void main(String[] args) throws IOException {
        // try-with-resources

        try(FileInputStream fis = new FileInputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/input.txt");
            FileOutputStream fos= new FileOutputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/output.txt");
            ){
            int a;
            while((a=fis.read())!=-1){
                fos.write(a);
            }
        }
    }
}
