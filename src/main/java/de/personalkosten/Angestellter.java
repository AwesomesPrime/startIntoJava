package de.personalkosten;

/**
 * Created by joel_thinkpad on 16.11.2017.
 */
public class Angestellter extends Mitarbeiter {

    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;

    public Angestellter ( String nachname,
                          double grundgehalt,
                          double ortszuschlag,
                          double zulage
    )
    {
        super(nachname);
        this.grundgehalt  = grundgehalt;
        this.ortszuschlag = ortszuschlag;
        this.zulage       = zulage;
    }
    protected void showMitarbeiter()
    {
        System.out.println("Personalnummer: " + this.personalnummer);
        System.out.println("Name          : " + this.nachname);
        System.out.println("Grundgehalt   : " + this.grundgehalt);
        System.out.println("Ortzuschlag   : " + this.ortszuschlag);
        System.out.println("Zulage        : " + this.zulage);

    }

    public double calcMonatsBrutto()
    {
        return this.grundgehalt + this.ortszuschlag + this.zulage;
    }

}
