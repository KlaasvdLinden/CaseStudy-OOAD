package oose.ooad.odinido;

public abstract class Vraag {
    protected int id;
    protected String tekstVraag;

    public Vraag(int id, String tekstVraag){
        this.id = id;
        this.tekstVraag = tekstVraag;
    }

    public String getTekstVraag() {
        return tekstVraag;
    }

    public int getId(){ return id;}

    public abstract boolean isCorrect(String gegevenAntwoord);

    public String toString(){
        return id + " " + tekstVraag + "\n";
    }
}
