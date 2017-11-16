package de.personalkosten;

/**
 * Created by joel_thinkpad on 16.11.2017.
 */
public class Manager extends  Mitarbeiter {
    private double fixgehalt;
    private double provision;
    private double umsatz;

    public Manager ( String nachname,
                     double fixgehalt,
                     double provision,
                     double umsatz
    )
    {
        super(nachname);
        this.fixgehalt = fixgehalt;
        this.provision = provision;
        this.umsatz    = umsatz;
    }

    public void showMitarbeiter()
    {
        System.out.println("Personalnummer: " + this.personalnummer);
        System.out.println("Name          : " + this.nachname);
        System.out.println("Fixgehalt     : " + this.fixgehalt);
        System.out.println("Provision     : " + this.provision);
        System.out.println("Umsatz        : " + this.umsatz);
    }

    public double calcMonatsBrutto()
    {
        return this.fixgehalt                     +
                (this.umsatz * this.provision / 100);
    }
}
