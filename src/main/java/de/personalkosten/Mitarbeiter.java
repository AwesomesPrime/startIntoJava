package de.personalkosten;

/**
 * Created by joel_thinkpad on 16.11.2017.
 */
public abstract class Mitarbeiter {

    protected static int    aktuellepersonalnummer = 0;
    protected        int    personalnummer;
    protected        String nachname;

    public Mitarbeiter(String nachname)
    {
        this.personalnummer = ++aktuellepersonalnummer;
        this.nachname   = nachname;
    }

    protected static int getAktuellePersonalnummer()
    {
        return Mitarbeiter.aktuellepersonalnummer;
    }

    protected abstract void showMitarbeiter();

    public abstract double calcMonatsBrutto();

}
