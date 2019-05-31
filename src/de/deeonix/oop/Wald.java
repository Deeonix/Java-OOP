package de.deeonix.oop;

import java.util.ArrayList;
import java.util.List;

public class Wald {
    private List<Baum> baumliste = new ArrayList<>();

    public void addBaum(Baum baum) {
        baumliste.add(baum);
    }

    public void addBaum(Baum... baum) {
        for(Baum b : baum) {
            baumliste.add(b);
        }
    }

    public void brenneBaumNieder(Baum baum) {
        baumliste.remove(baum);
    }

    public List<Baum> getBaumliste() {
        return this.baumliste;
    }
}
