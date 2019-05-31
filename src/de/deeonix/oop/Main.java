package de.deeonix.oop;

public class Main {

    public static void main(String[] args) {
        /*
        * Hier erstellen wir die Bäume
        * */
        Baum baum1 = new Baum(BaumKategorie.BIRKE, 10, 0x000000);
        Baum baum2 = new Baum(BaumKategorie.BIRKE, 20, 0x000000);
        Baum baum3 = new Baum(BaumKategorie.AHORN, 30, 0x000000);
        Baum baum4 = new Baum(BaumKategorie.TANNE, 12, 0x000000);
        Baum baum5 = new Baum(BaumKategorie.NILS, 17, 0x000000);
        Baum baum6 = new Baum(BaumKategorie.ESCHE, 72, 0x000000);
        Baum baum7 = new Baum(BaumKategorie.AHORN, 18, 0x000000);

        /*
        * Hier erstellen wir einen Wald und fügen die Bäume hinzu.
        * */
        Wald wald = new Wald();
        wald.addBaum(baum1, baum2, baum3, baum4, baum5, baum6, baum7);

        /*
        * Hier werden nun die Bäume ausgegeben.
        * */
        System.out.println("Wir haben " + wald.getBaumliste().size() + " Bäume:");
        for (Baum baum : wald.getBaumliste()) {
            System.out.println("Ein Baum der Art '" + baum.getKategorie() + "' ist " + baum.getGroesse() + " Meter groß und hat die Farbe " + baum.getFarbe() + ".");
        }
    }
}
