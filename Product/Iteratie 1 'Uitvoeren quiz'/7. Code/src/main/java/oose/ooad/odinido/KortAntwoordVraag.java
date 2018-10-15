package oose.ooad.odinido;

import java.util.ArrayList;

public class KortAntwoordVraag extends Vraag {
    private ArrayList<Antwoord> antwoorden;
    public KortAntwoordVraag(int id, String tekstVraag) {
        super(id, tekstVraag);
        antwoorden = new ArrayList<Antwoord>();
    }

    public boolean isCorrect() {
        return false;
    }
}
