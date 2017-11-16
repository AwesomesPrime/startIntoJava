package de.rennauto;

public class Main {

    public static void main (String[] args) {
        Rennwagen wagen = new Rennwagen("Carrera GT", "Porsche");
        /*System.out.println("MAX Tankfüllung: " + wagen.getMaxtankinhalt());
        wagen.setMaxtankinhalt(300);
        wagen.tanken(290);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());
        wagen.fahren((float)400.0, (float)44.5);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());
        wagen.tanken(200);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());*/

        Fahrer  rosberg = new Fahrer(1, "Nico", "Rosberg", 35, 12000);
        Fahrer  alonso= new Fahrer(3, "Fernando", "Alsonso", 32, 32100);
        Fahrer  vettel= new Fahrer(2, "Sebastin", "Vettel", 27, 34000);

        wagen.einfuegenFahrer(rosberg);
        wagen.einfuegenFahrer(alonso);
        wagen.einfuegenFahrer(vettel);
        wagen.druckeFahrerliste();
        wagen.druckeFahrerliste();

    }

}
