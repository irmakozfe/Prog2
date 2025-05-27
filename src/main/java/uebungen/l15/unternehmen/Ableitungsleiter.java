package uebungen.l15.unternehmen;

public class Ableitungsleiter extends Angestellter{

    public Ableitungsleiter(String vorname, String nachname, String id,
                            double grundgehalt, String gdatum){
        super(vorname, nachname, id , grundgehalt, gdatum);
        this.gehaltsfaktor=2;
        this.gehalt=gehaltsfaktor * grundgehalt;
    }

    public void befoerdern(Angestellter angestellter){
        angestellter.gehaltsfaktor = 1.1 * angestellter.gehaltsfaktor;
        angestellter.gehalt = angestellter.gehaltsfaktor * angestellter.grundgehalt;
    }



}
