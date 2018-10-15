package oose.ooad.odinido;

public abstract class Vraag {
    protected int id;
    protected String tekstVraag;
    protected String gegevenAntwoord;

    public Vraag(int id, String tekstVraag){
        this.id = id;
        this.tekstVraag = tekstVraag;
    }

    public String getTekstVraag() {
        return tekstVraag;
    }

    public String getGegevenAntwoord() {
        return gegevenAntwoord;
    }

    public void setGegevenAntwoord(String gegevenAntwoord) {
        this.gegevenAntwoord = gegevenAntwoord;
    }

    public abstract boolean isCorrect();

    public String toString(){
        return id + " " + tekstVraag + "\n";
    }
}
