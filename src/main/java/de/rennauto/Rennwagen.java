package de.rennauto;


import java.util.HashMap;
import java.util.Map;

public class Rennwagen {


    private static int anzahlRennwagen = 0;
    private String id;
    private String modell;
    private String hersteller;
    private int leistung;
    private int hubraum;
    private float istTankInhalt;
    private float maxTankInhalt;
    private Map<String, Fahrer> fahrerMap = new HashMap<>();

    public Rennwagen() {
        id = "RW_" + anzahlRennwagen;
        anzahlRennwagen++;
        istTankInhalt=5;
        maxTankInhalt=5;
    }

    public Rennwagen(String modell, String hersteller) {
        this();
        this.modell = modell;
        this.hersteller = hersteller;
    }

    public Rennwagen(String modell, String hersteller, float maxTankInhalt) {
        this(modell, hersteller);
        this.maxTankInhalt = maxTankInhalt;
    }

    public void einfuegenFahrer(Fahrer fahrer) {
        fahrerMap.put(fahrer.getName(), fahrer);
    }

    public void loescheFahrer(Fahrer fahrer) {
        fahrerMap.remove(fahrer.getName());
    }

    public void druckeFahrerliste() {


        for(Map.Entry<String, Fahrer> stringFahrerEntry : fahrerMap.entrySet()){
            stringFahrerEntry.getValue().getInfo();
        }
    }


    public void fahren(float gefahreneKilometer, float durschnittsVerbrauch){
        float verbrauch = gefahreneKilometer * durschnittsVerbrauch / 100;
        if (verbrauch >= getIsttankinhalt()) {
            setIstTankInhalt(0);
            System.out.println("Tank leer");
        } else {
            setIstTankInhalt(getIsttankinhalt() - verbrauch);
        }
    }

    public void tanken(float liter){
        float neuerTankInhalt = getIsttankinhalt() + liter;
        setIstTankInhalt(neuerTankInhalt);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public float getIsttankinhalt() {
        return istTankInhalt;
    }

    public void setIstTankInhalt(float istTankInhalt) {
        if(istTankInhalt <= getMaxtankinhalt()) {
            this.istTankInhalt = istTankInhalt;
        } else {
            this.istTankInhalt = getMaxtankinhalt();
            System.out.println("Tank läuft über");
        }
    }

    public float getMaxtankinhalt() {
        return maxTankInhalt;
    }

    public void setMaxtankinhalt(float maxTankInhalt) {
        this.maxTankInhalt = maxTankInhalt;
    }
}
