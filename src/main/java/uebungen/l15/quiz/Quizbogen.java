package uebungen.l15.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quizbogen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuizFragen[] quizbogen = new QuizFragen[3];
        quizbogen[0] = new TextFragen("Ist Südafrica ein Land?","Ja");

        //daha öğren
        List<Choice> choices = List.of(
                new Choice(Schick.A, "Berlin"),
                new Choice(Schick.B, "Kairo"),
                new Choice(Schick.C, "München"),
                new Choice(Schick.D, "Hamburg")

        );
        quizbogen[1]= new MultipleChoiceFragen("Was ist die Hauptstadt von Deutschland?", Schick.A, choices);

        quizbogen[2]= new TextFragen("Was ist die kleinsten Primzahl?", "2");

        //printing the questions

        for(QuizFragen fragen : quizbogen) {

            if(fragen instanceof TextFragen){
                TextFragen frage = (TextFragen) fragen;
                System.out.println(fragen.getQuestion());
                System.out.print("Deine Antwort: ");
                String antwort = scanner.nextLine().trim();

                if (antwort.equalsIgnoreCase(frage.getAntwort())){
                    System.out.println("Korrekt!");
                }else{
                    System.out.println("du Dummkopf");
                }
            } else if(fragen instanceof MultipleChoiceFragen){
                MultipleChoiceFragen frage = (MultipleChoiceFragen) fragen;
                System.out.println(fragen.getQuestion());
                for(Choice choice : frage.getChoices()){
                    System.out.println(choice.getSchick() + ": "+ choice.getText());
                }
                System.out.print("Deine Antwort: ");
                String antwort = scanner.nextLine().trim().toUpperCase();

                if(Schick.valueOf(antwort) == frage.getCorrectSchick()){
                    System.out.println("Korrekt!");
                }else{
                    System.out.println("du Dummkopf");
                }
            }

        }
     scanner.close();
    }
}
