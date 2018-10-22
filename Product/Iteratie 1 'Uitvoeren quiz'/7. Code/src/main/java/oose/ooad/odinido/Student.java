package oose.ooad.odinido;

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
                kennistoets.setAntwoord(antwoord, v);
            }
        System.out.println("Klaar met toets");
        for (Vraag vraag : kennistoets.getVragen()) {
            Vraag v = vraag;
            System.out.println(v.getTekstVraag() + " Gegeven antwoord: " + v.getGegevenAntwoord());
            System.out.println("TekstAntwoord correct ? " + v.isCorrect());
        }
    }
}
