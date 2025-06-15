package uebungen.l18.decorator.umlautentferner;

import uebungen.l18.decorator.DecoratorWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class UmlautEntferner extends DecoratorWriter {

    public UmlautEntferner(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(char[] c, int off, int len ) throws IOException{

        for (int i = off; i < off + len; i++) {
            switch (c[i]) {
                case 'ä':
                    writer.write("ae");
                    break;
                case 'ö':
                    writer.write("oe");
                    break;
                case 'ü':
                    writer.write("ue");
                    break;
                case 'Ä':
                    writer.write("AE");
                    break;
                case 'Ö':
                    writer.write("OE");
                    break;
                case 'Ü':
                    writer.write("UE");
                    break;
                case 'ß': writer.write("ss"); break;
                default:
                    writer.write(c[i]);
                    break;
            }
        }


    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Writer writer = new UmlautEntferner(new OutputStreamWriter(System.out));
        writer.write("Ich habe saumäsig geschlafen. Grüß dich!");
        writer.close();
    }

}
