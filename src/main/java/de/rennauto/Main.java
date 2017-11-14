package de.rennauto;

public class Main {

    public static void main (String[] args) {
        Rennwagen wagen = new Rennwagen("Carrera GT", "Porsche");
        System.out.println("MAX Tankfüllung: " + wagen.getMaxtankinhalt());
        wagen.setMaxtankinhalt(300);
        wagen.tanken(290);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());
        wagen.fahren((float)400.0, (float)44.5);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());
        wagen.tanken(200);
        System.out.println("IST Tankfüllung: " +
                wagen.getIsttankinhalt());

    }

}
