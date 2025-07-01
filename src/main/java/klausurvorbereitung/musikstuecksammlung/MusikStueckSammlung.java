package klausurvorbereitung.musikstuecksammlung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusikStueckSammlung {
    Map<String, MusikStueck> sammlung = new HashMap<>();

    public void einfuegen(MusikStueck m){
        if(sammlung.containsKey(m.titel)){
            throw new IllegalArgumentException("");
        }

        sammlung.put(m.titel, m);
    }

    public List<MusikStueck> getAllMusikStueckNachTitel(){
        List<MusikStueck> musik = new ArrayList<>(sammlung.values());
        musik.sort(new VergleicheMusikStueckTitel());
        return musik;
    }

    public List<MusikStueck> getAllMusikStueckNachLaenge(){
        List<MusikStueck> m = new ArrayList<>(sammlung.values());
        m.sort(new VergleicheMusikStueckLaenge());
        return m;

    }
}
