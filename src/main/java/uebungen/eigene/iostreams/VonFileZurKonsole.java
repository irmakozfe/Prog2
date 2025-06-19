package uebungen.eigene.iostreams;

import java.io.*;

public class VonFileZurKonsole {
    public static void main(String[] args) throws IOException {
        // try-with-resources

        try(
                FileInputStream fis= new FileInputStream("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/iostreams/input.txt");
                InputStreamReader isr= new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                ){
            String line;
            while ((line = br.readLine()) != null) { // read() : -1, readLine() : null
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
