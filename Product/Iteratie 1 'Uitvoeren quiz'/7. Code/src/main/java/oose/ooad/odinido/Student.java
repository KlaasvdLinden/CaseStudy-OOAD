package oose.ooad.odinido;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String studentnaam;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }


    public void uitvoerenKennistoets(Kennistoets kennistoets) {
        Scanner scanner = new Scanner(System.in);

        for (Vraag v : kennistoets.getVragen()) {
            String vraagData = kennistoets.getVraagData(v);
            System.out.println(vraagData);
            String antwoord = scanner.nextLine();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(antwoord, studentnaam);
            v.addGegevenAntwoord(gegevenAntwoord);
        }
        System.out.println("Klaar met toets");
        for (Vraag vraag : kennistoets.getVragen()) {
            Vraag v = vraag;
            System.out.print(v.getId() + ". ");
            String antwoord = v.getGegevenAntwoord(studentnaam);
            System.out.println(v.getTekstVraag() + " Gegeven antwoord: " + antwoord);
            System.out.println("TekstAntwoord correct? " + v.isCorrect(antwoord));
        }
    }
}
