package oose.ooad.odinido;

import java.util.ArrayList;

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


    public String getData(){
        return id + " " + tekstVraag + "\n";
    }
}
