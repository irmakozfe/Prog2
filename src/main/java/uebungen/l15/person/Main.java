package uebungen.l15.person;

public class Main {
    public static void main(String[] args) {
        Person[] studenten= new Student[50];
        Person[] professors = new Professor[50];

        for (int i =0 ; i < studenten.length ; i++) {
            studenten[i]= new Student("Irmak", "Özdemir", "Programmieren");
            professors[i]= new Professor("PRank", "Deinz", "Programmieren");
        }

        for(int i=0, j=0; i < 50 ; i++, j++) {
            System.out.println("Der " + studenten[i].gibTaetigkeitAus() + " besucht das Fach " + studenten[i].fach);
            System.out.println("Der " + professors[i].gibTaetigkeitAus() + " unterricht das Fach " + professors[i].fach);
        }

    }
}
