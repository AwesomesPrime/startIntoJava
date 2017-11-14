package de.steckbrief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) {

        String vorname = null;
        String nachname = null;
        int körpergröße = 0;
        int alter = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Bitte gib deinen Vornamen an:");
            vorname = br.readLine();

            System.out.println("Bitte gib deinen Nachnamen an:");
            nachname = br.readLine();

            System.out.println("Bitte gib deine Alter an:");
            try {
                alter = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                alter = askForInt(br);
            }

            System.out.println("Bitte gib deine Körpergröße in cm an:");
            try {
                körpergröße = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                körpergröße = askForInt(br);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Sind folgende Angaben korrekt?");
        System.out.println("Name: " + vorname + " " + nachname);
        System.out.println("Alter: " + alter);
        System.out.println("Körpergröße: " + körpergröße);

    }

    private static int askForInt(BufferedReader br) throws IOException {
        System.out.println("Bitte gib eine ganze Zahl an");
        return Integer.parseInt(br.readLine());
    }

}
