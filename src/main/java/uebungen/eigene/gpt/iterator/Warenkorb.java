package uebungen.eigene.gpt.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warenkorb implements Iterable<Produkt> {
    List<Produkt> produkts = new ArrayList<>();

    public void add(Produkt produkt) {
        produkts.add(produkt);
    }

    @Override
    public Iterator<Produkt> iterator() {
        return produkts.iterator();
    }


    public static void main(String[] args){
        Warenkorb warenkorb = new Warenkorb();
        warenkorb.add(new Produkt("Schokolade", 1.29));
        warenkorb.add(new Produkt("Kekse", 1.19));
        warenkorb.add(new Produkt("Datteltomaten", 1.99));

        for(Produkt produkt : warenkorb){
            System.out.println(produkt.getName() + " " + produkt.getPreis() );
        }


    }

}