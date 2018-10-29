package oose.ooad.odinido;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String studentnaam;
    private ArrayList<GegevenAntwoord> gegevenAntwoorden;
    private Scanner scanner;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
        this.gegevenAntwoorden = new ArrayList<GegevenAntwoord>();
        this.scanner = new Scanner(System.in);
    }


    public void uitvoerenKennistoets(Kennistoets kennistoets) {
        for (Vraag vraag : kennistoets.getVragen()) {
            String vraagData = kennistoets.getVraagData(vraag);
            System.out.println(vraagData);
            String tekstAntwoord = getInput();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(tekstAntwoord, studentnaam, vraag);
            voegGegevenAntwoordToe(gegevenAntwoord);
        }
        System.out.println("Klaar met toets");
        for(GegevenAntwoord gegevenAntwoord : gegevenAntwoorden){
            Vraag vraag = gegevenAntwoord.getVraag();
            System.out.println("Het gegevenanntwoord bij " + vraag.getTekstVraag() + " is: " + gegevenAntwoord.getTekstAntwoord());
            System.out.println(vraag.isCorrect(gegevenAntwoord.getTekstAntwoord()));
        }
    }

    private void voegGegevenAntwoordToe(GegevenAntwoord gegevenAntwoord){
        this.gegevenAntwoorden.add(gegevenAntwoord);
    }

    private String getInput(){
        return scanner.nextLine();
    }
}
