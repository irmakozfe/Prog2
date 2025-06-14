package uebungen.eigene;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class InRAMSchreiben {
    public static void main(String[] args) throws IOException {
    //try-with-resources yazmana gerek yok çünkü RAM e yazıyorsun kapatacak bir şey yok
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            String message = "LOL";
            byte[] msgbytes = message.getBytes(); // String to byte

            baos.write(msgbytes); // writes byte to RAM

            //-----------------------------------------------

            byte[] data = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(data); // read bytes from RAM

            int a;

            while ((a = bais.read()) != -1) {
                System.out.print((char) a); // byte to char
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
