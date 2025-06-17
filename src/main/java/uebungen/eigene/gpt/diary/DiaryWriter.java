package uebungen.eigene.gpt.diary;

import java.io.*;

public class DiaryWriter {

    public static void main(String[] args)  throws IOException {



        try(BufferedReader reader = new BufferedReader(new FileReader("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/gpt/diary/day1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/eigene/gpt/diary/diary.txt"))){

            String line;
            while((line= reader.readLine()) != null){
                System.out.println(line); // to see it on the console
                writer.write(line);
                writer.newLine();
            }
        }

    }
}
