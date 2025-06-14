package uebungen.l18.studiengangsplitter;

import java.io.*;
import java.nio.charset.MalformedInputException;

public class Studiengangssplitter {

    public static void splitStudiengang(String dateiname) throws IOException,MatrikelNummerException {
        try(
                BufferedReader reader = new BufferedReader(new FileReader(dateiname));
                BufferedWriter WinfWriter = new BufferedWriter(new FileWriter("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/l18/studiengangsplitter/WInfNr.txt"));
                BufferedWriter InfWriter = new BufferedWriter(new FileWriter("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/l18/studiengangsplitter/InfNr.txt"));
                BufferedWriter ECNrWriter = new BufferedWriter(new FileWriter("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/l18/studiengangsplitter/ECNr.txt"));
                ){
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int MatNr= Integer.parseInt(line);

                    if(MatNr >= 5000000 & MatNr <= 5099999){
                        WinfWriter.write(line);
                        WinfWriter.newLine();
                    }
                    else if(MatNr >= 5100000 & MatNr <= 5199999){
                        InfWriter.write(line);
                        InfWriter.newLine();
                    }
                    else if(MatNr >= 6100000 & MatNr <= 6199999){
                        ECNrWriter.write(line);
                        ECNrWriter.newLine();
                    } else{
                        throw new MatrikelNummerException("Ungueltige Matrikelnummer");
                    }

                }catch (NumberFormatException e){
                    throw new MatrikelNummerException("Ungueltige Matrikelnummer!");
                }
            }

        }

    }

    public static void main(String[] args) throws IOException, MatrikelNummerException {
        try{
            splitStudiengang("/home/damla/IdeaProjects/Prog2/src/main/java/uebungen/l18/studiengangsplitter/MatNr.txt");
        }catch(MatrikelNummerException e){
            System.out.println(e.getMessage());
        }

    }
}
