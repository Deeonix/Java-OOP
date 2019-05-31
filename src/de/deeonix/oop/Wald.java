package de.deeonix.oop;

import java.util.ArrayList;
import java.util.List;

public class Wald {
    /*
    * Deklaration und Definition einer Liste für das Objekt "Baum".
    * */
    private List<Baum> baumliste = new ArrayList<>();

    /*
    * Methode um einen einzelnen Baum zum Wald hinzuzufügen.
    * */
    public void addBaum(Baum baum) {
        baumliste.add(baum);
    }

    /*
     * Methode um einen mehrere Bäume zum Wald hinzuzufügen.
     * */
    public void addBaum(Baum... baum) {
        for(Baum b : baum) {
            baumliste.add(b);
        }
    }

    /*
     * Methode um einen Baum vom Wald zu entfernen.
     * */
    public void brenneBaumNieder(Baum baum) {
        baumliste.remove(baum);
    }

    /*
     * Getter für die Baumliste.
     * */
    public List<Baum> getBaumliste() {
        return this.baumliste;
    }
}
