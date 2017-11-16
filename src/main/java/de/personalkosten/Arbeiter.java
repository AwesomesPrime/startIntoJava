package de.personalkosten;

/**
 * Created by joel_thinkpad on 16.11.2017.
 */
public class Arbeiter extends Mitarbeiter {

    private double stundenlohn;
    private double anzahlstunden;
    private double ueberstundenzuschlag;
    private double anzahlueberstunden;

    public Arbeiter ( String nachname,
                      double stundenlohn,
                      double anzahlstunden,
                      double ueberstundenzuschlag,
                      double anzahlueberstunden
    )
    {
        super(nachname);
        this.stundenlohn          = stundenlohn;
        this.anzahlstunden        = anzahlstunden;
        this.ueberstundenzuschlag = ueberstundenzuschlag;
        this.anzahlueberstunden   = anzahlueberstunden;
    }

    protected void showMitarbeiter()
    {
        System.out.println("Personalnummer      : "
                + this.personalnummer);
        System.out.println("Name                : "
                + this.nachname);
        System.out.println("Stundenlohn         : "
                + this.stundenlohn);
        System.out.println("Anzahl Stunden      : "
                + this.anzahlstunden);
        System.out.println("Ueberstundenzuschlag: "
                + this.ueberstundenzuschlag);
        System.out.println("Anzahl Ueberstunden : "
                + this.anzahlueberstunden);
    }

    public double calcMonatsBrutto()
    {
        return (this.stundenlohn * this.anzahlstunden) +
                (this.ueberstundenzuschlag * this.anzahlueberstunden);
    }
}
