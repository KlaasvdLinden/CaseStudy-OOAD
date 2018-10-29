package oose.ooad.odinido;

public class GegevenAntwoord {
    private String tekstAntwoord;
    private String studentnaam;
    private Vraag vraag;

    GegevenAntwoord(String tekstAntwoord, String studentnaam, Vraag vraag){
        this.tekstAntwoord = tekstAntwoord;
        this.studentnaam = studentnaam;
        this.vraag = vraag;
    }

    public String getTekstAntwoord(){
        return tekstAntwoord;
    }

    public String getStudentnaam(){
        return studentnaam;
    }

    public Vraag getVraag(){
        return vraag;
    }
}
