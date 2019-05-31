package de.deeonix.oop;

public class Main {

    public static void main(String[] args) {
        Baum baum1 = new Baum(10, 0x000000);
        Baum baum2 = new Baum(20, 0x000000);
        Baum baum3 = new Baum(30, 0x000000);
        Baum baum4 = new Baum(12, 0x000000);
        Baum baum5 = new Baum(17, 0x000000);
        Baum baum6 = new Baum(72, 0x000000);
        Baum baum7 = new Baum(18, 0x000000);

        Wald wald = new Wald();
        wald.addBaum(baum1, baum2, baum3, baum4, baum5, baum6, baum7);

        System.out.println("Wir haben " + wald.getBaumliste().size() + " Bäume:");
        for (Baum baum : wald.getBaumliste()) {
            System.out.println("Ein Baum ist " + baum.getGroesse() + " Meter groß und hat die Farbe " + baum.getFarbe() + ".");
        }
    }
}
