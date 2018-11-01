package oose.ooad.odinido;

import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    private ArrayList<TekstAntwoord> antwoorden;

    public KortAntwoordVraag(int id, String tekstVraag, ArrayList antwoorden) {
        super(id, tekstVraag);
        this.antwoorden = antwoorden;
    }

    public boolean isCorrect(String gegevenAntwoord) {
        for (TekstAntwoord tekstAntwoord : antwoorden) {
            if (gegevenAntwoord.equalsIgnoreCase(tekstAntwoord.getTekstAntwoord())) {
                return true;
            }
        }
        return false;
    }

    public String getData() {
        return id + " " + tekstVraag + "\n";
    }
}
