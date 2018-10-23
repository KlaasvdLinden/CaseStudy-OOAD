package oose.ooad.odinido;

import java.util.Scanner;

public class Student {

    private String studentnaam;
    private String[] gegevenAntwoorden;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }


    public void uitvoerenKennistoets(Kennistoets kennistoets) {
        Scanner scanner = new Scanner(System.in);
        gegevenAntwoorden = new String[kennistoets.getVragen().size()];
            for (Vraag v : kennistoets.getVragen()) {
                String vraagData = kennistoets.getVraagData(v);
                System.out.println(vraagData);
                String antwoord = scanner.nextLine();
                setGegevenAntwoorden(v.getId() -1, antwoord);
            }
        System.out.println("Klaar met toets");
        for (Vraag vraag : kennistoets.getVragen()) {
            Vraag v = vraag;
            System.out.println(v.getId() -1);
            System.out.println(v.getTekstVraag() + " Gegeven antwoord: " + gegevenAntwoorden[v.getId() -1]);
           System.out.println("TekstAntwoord correct ? " + v.isCorrect(gegevenAntwoorden[v.getId()-1]));
        }

    }

    public void setGegevenAntwoorden(int vraagnummer, String antwoord ){
        gegevenAntwoorden[vraagnummer] = antwoord;
    }
}
