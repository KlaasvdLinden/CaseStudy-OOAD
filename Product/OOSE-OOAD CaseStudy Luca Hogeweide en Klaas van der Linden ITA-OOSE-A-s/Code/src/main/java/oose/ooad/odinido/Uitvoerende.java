package oose.ooad.odinido;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Uitvoerende {

    protected Scanner scanner;
    protected ArrayList<GegevenAntwoord> gegevenAntwoorden;
    protected String naam;

    Uitvoerende(String naam){
        this.naam = naam;
        this.scanner = new Scanner(System.in);
        this.gegevenAntwoorden = new ArrayList<GegevenAntwoord>();
    }

    public void uitvoerenKennistoets(Kennistoets kennistoets) {
        for (Vraag vraag : kennistoets.getVragen()) {
            String vraagData = kennistoets.getVraagData(vraag);
            System.out.println(vraagData);
            String tekstAntwoord = getInput();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(tekstAntwoord, naam, vraag);
            voegGegevenAntwoordToe(gegevenAntwoord);
        }
        System.out.println("Uitvoeren van de toets is afgerond");
    }

    protected String getInput(){
        return scanner.nextLine();
    }

    protected void voegGegevenAntwoordToe(GegevenAntwoord gegevenAntwoord){
        gegevenAntwoorden.add(gegevenAntwoord);
    }
}
