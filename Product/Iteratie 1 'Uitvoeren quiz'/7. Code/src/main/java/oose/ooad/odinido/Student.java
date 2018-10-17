package oose.ooad.odinido;

import java.util.Scanner;

public class Student {

    private String studentnaam;
    private boolean studentBezig = false;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }

    public void beginKennisToets() {
        studentBezig = true;
    }

    public void uitvoerenKennistoets(Kennistoets kennistoets) {
        Scanner scanner = new Scanner(System.in);
        beginKennisToets();
        while (studentBezig) {
            for (Vraag v : kennistoets.getVragen()) {
                String vraagData = kennistoets.getVraagData(v);
                System.out.println(vraagData);
                String antwoord = scanner.nextLine();
                kennistoets.setAntwoord(antwoord, v);
                if (kennistoets.getVragen().indexOf(v) == (kennistoets.getVragen().size() - 1)) {
                    studentBezig = false;
                }
            }
        }
        System.out.println("Klaar met toets");
        for (Vraag vraag : kennistoets.getVragen()) {
            Vraag v = vraag;
            System.out.println(v.getTekstVraag() + " Gegeven antwoord: " + v.getGegevenAntwoord());
            System.out.println("TekstAntwoord correct ? " + v.isCorrect());
        }
    }


}
