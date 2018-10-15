package oose.ooad.odinido;

public class Alternatief {
    private boolean correct;
    private String tekstAntwoord;
    private String letter;

    public Alternatief(boolean correct, String tekstAntwoord, String letter){
        this.correct = correct;
        this.tekstAntwoord = tekstAntwoord;
        this.letter = letter;
    }

    public boolean getCorrect(){
        return correct;
    }

    public String getLetter(){
        return letter;
    }

    public String toString() {
        return letter + " " + tekstAntwoord + "\n";
    }
}
