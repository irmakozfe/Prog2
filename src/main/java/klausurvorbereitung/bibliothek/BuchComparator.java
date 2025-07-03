package klausurvorbereitung.bibliothek;

import java.util.Comparator;

public class BuchComparator implements Comparator<Buch> {

    @Override
    public int compare(Buch b1, Buch b2){
        int autorCompare= b1.author.compareToIgnoreCase(b2.author);
        if(autorCompare != 0){
            return autorCompare;
        }
        return b1.name.compareToIgnoreCase(b2.name);
    }


}
