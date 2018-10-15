package oose.ooad.odinido;

import java.util.Scanner;

public class Student {

    private String studentnaam;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }

    public void uitvoerenKennistoets(Kennistoets kennistoets){
        Scanner scanner = new Scanner(System.in);
        for(Vraag vraag : kennistoets.getVragen()){
            Vraag v = vraag;
            System.out.println(v.toString());
            String antwoord = scanner.nextLine();
            v.setGegevenAntwoord(antwoord);
        }
        for(Vraag vraag : kennistoets.getVragen()){
            Vraag v = vraag;
            System.out.println(v.getTekstVraag() + " Gegeven antwoord: " + v.getGegevenAntwoord());
            System.out.println("Antwoord correct ? " +  v.isCorrect());
        }
    }
}
