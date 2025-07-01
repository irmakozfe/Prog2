package klausurvorbereitung.musikstuecksammlung;

import java.util.Comparator;
import java.util.List;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck m, MusikStueck n){
        return m.titel.compareToIgnoreCase(n.titel);
    }
}
