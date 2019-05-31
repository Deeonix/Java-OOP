package de.deeonix.oop;

public class Baum {
    /*
    * Deklaration
    * */
    private int groesse;
    private int farbe;
    private BaumKategorie kategorie;

    /*
    * Das ist ein Konstruktor
    * Konstruktor = Bauplan der Klasse
    * */
    public Baum(BaumKategorie kategorie, int groesse, int farbe) {
        /*
        * Definition
        * */
        this.kategorie = kategorie;
        this.groesse = groesse;
        this.farbe = farbe;
    }

    /*
    * Das hier nennt man Getter.
    * Man nutzt Getter um Informationen abzurufen.
    * */
    public int getGroesse() {
        return groesse;
    }
    public int getFarbe() {
        return farbe;
    }
    public BaumKategorie getKategorie() {
        return kategorie;
    }
}
