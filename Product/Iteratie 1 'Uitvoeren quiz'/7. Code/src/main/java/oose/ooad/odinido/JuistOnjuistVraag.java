package oose.ooad.odinido;

import java.util.ArrayList;

public class JuistOnjuistVraag extends Vraag {
    private ArrayList<TekstAntwoord> tekstAntwoorden;
    public JuistOnjuistVraag(int id, String tekstVraag, ArrayList tekstAntwoorden) {
        super(id, tekstVraag);
        this.tekstAntwoorden = tekstAntwoorden;
    }

    public boolean isCorrect(String gegevenAntwoord) {
        return false;
    }
}
