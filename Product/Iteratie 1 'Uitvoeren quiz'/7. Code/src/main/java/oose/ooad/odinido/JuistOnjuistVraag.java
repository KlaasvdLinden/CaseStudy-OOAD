package oose.ooad.odinido;

public class JuistOnjuistVraag extends Vraag {
    private Antwoord antwoord;
    public JuistOnjuistVraag(int id, String tekstVraag, Antwoord antwoord) {
        super(id, tekstVraag);
        this.antwoord = antwoord;
    }

    public boolean isCorrect() {
        return false;
    }
}
