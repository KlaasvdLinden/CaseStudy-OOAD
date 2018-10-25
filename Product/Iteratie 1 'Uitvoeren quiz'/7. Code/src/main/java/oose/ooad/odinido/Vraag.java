package oose.ooad.odinido;

import java.util.ArrayList;

public abstract class Vraag {
    protected int id;
    protected String tekstVraag;
    private ArrayList<GegevenAntwoord> gegevenAntwoorden;

    public Vraag(int id, String tekstVraag){
        this.id = id;
        this.tekstVraag = tekstVraag;
        this.gegevenAntwoorden = new ArrayList<GegevenAntwoord>();
    }

    public String getTekstVraag() {
        return tekstVraag;
    }

    public int getId(){ return id;}

    public abstract boolean isCorrect(String gegevenAntwoord);

    public void addGegevenAntwoord(GegevenAntwoord gegevenAntwoord){
        gegevenAntwoorden.add(gegevenAntwoord);
    }

    public String getGegevenAntwoord(String studentnaam){
        String antwoord=  "";
        for(GegevenAntwoord gegevenAntwoord : gegevenAntwoorden){
            if(gegevenAntwoord.getStudentnaam().equals(studentnaam)){
                antwoord = gegevenAntwoord.getTekstAntwoord();
            }
        }
        return antwoord;
    }

    public String toString(){
        return id + " " + tekstVraag + "\n";
    }
}
