package de.personalkosten;

/**
 * Created by joel_thinkpad on 16.11.2017.
 */
public class Personalkosten {
    private static final int       ANZAHL_MA    = 100;
    private static       Mitarbeiter[] mitarbeiterarray;
    private static       double    bruttosumme = 0;

    static public void main(String[] args)
    {
        mitarbeiterarray    = new Mitarbeiter[ANZAHL_MA];
        mitarbeiterarray[0] = new Manager("Franz",10000, 5, 20000);
        mitarbeiterarray[1] = new Arbeiter("Hugo",24.52,40,5.5,10);
        mitarbeiterarray[2] = new Angestellter("Oskar",2790.52,760.98,30.99);

        bruttosumme = bruttosumme +
                mitarbeiterarray[0].calcMonatsBrutto();
        bruttosumme = bruttosumme +
                mitarbeiterarray[1].calcMonatsBrutto();
        bruttosumme = bruttosumme +
                mitarbeiterarray[2].calcMonatsBrutto();

        System.out.println("Gesamt Brutto pro Monat: "
                + Math.round(bruttosumme));

        mitarbeiterarray[0].showMitarbeiter();
        mitarbeiterarray[1].showMitarbeiter();
        mitarbeiterarray[2].showMitarbeiter();


        System.out.println("ActPersNr: " + mitarbeiterarray[1].getAktuellePersonalnummer());
    }
}
