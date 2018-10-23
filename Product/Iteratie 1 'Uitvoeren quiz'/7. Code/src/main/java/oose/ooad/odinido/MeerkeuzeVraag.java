package oose.ooad.odinido;

import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag {
    private ArrayList<Alternatief> alternatieven;

    public MeerkeuzeVraag(int id, String tekstVraag, ArrayList alternatieven) {
        super(id, tekstVraag);
        this.alternatieven = alternatieven;
    }

    public boolean isCorrect(String gegevenAntwoord) {
        String correctAntwoord = "";
        for (Alternatief alternatief : alternatieven) {
            if (alternatief.getCorrect() == true) {
                correctAntwoord = alternatief.getLetter();
            }
        }
        if (gegevenAntwoord.equalsIgnoreCase(correctAntwoord)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return id + " " + tekstVraag + "\n" + alternatieven.toString();
    }

}
