package klausurvorbereitung.iban;

import uebungen.eigene.generics.Liste;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IBAN {

    public static boolean checkIban(String iban) {

        if(iban.startsWith("DE") && iban.length() == 22 ) {
                return true;
        }else{
            throw new FalscheIBANException("Invalid IBAN format");
        }


    }

    public static List<String > liesIBANAusDatei(String datei){
        List<String> gueltigeIbans = new ArrayList<>();

            try(BufferedReader br = new BufferedReader(new FileReader(datei))
            ){
                String line;

                while((line =br.readLine()) != null){
                    if(checkIban(line)){
                        gueltigeIbans.add(line);
                    }

                }
            }catch(IOException e){
                e.printStackTrace();
            }

            return gueltigeIbans;
    }

    public static Map<String, List<String>> liesIbanAusDateien(List<String> dateien){
        Map<String, List<String>> ibans = new HashMap<>();
        for(String s : dateien){
            List<String> gueltigeIbans = new ArrayList<>();

            try{
                Files.lines(Paths.get(s)).forEach(line -> {
                    try{
                        checkIban(line);
                    }catch(FalscheIBANException e){
                        gueltigeIbans.add(line);
                    }
                });

                ibans.put(s,gueltigeIbans);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return ibans;

    }


    public static void main(String[] args) {
        List<String> test = liesIBANAusDatei("/home/damla/IdeaProjects/Prog2/src/main/java/klausurvorbereitung/iban/ibans.txt");
        List<String> dateien = new ArrayList<>();
        dateien.add("/home/damla/IdeaProjects/Prog2/src/main/java/klausurvorbereitung/iban/ibans.txt");
        dateien.add("/home/damla/IdeaProjects/Prog2/src/main/java/klausurvorbereitung/iban/ibans2.txt");

        Map<String, List<String> > test2= liesIbanAusDateien(dateien);

        for(String s : test){
            System.out.println(s);
        }

        test2.forEach((datei, ibanListe) -> {
            System.out.println(datei);
            System.out.print("");
            ibanListe.forEach(iban -> System.out.println(iban));

        });



    }



}
