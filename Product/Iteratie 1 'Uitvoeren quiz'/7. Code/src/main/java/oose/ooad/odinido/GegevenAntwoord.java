package oose.ooad.odinido;

public class GegevenAntwoord {
    String tekstAntwoord;
    String studentnaam;

    GegevenAntwoord(String tekstAntwoord, String studentnaam){
        this.tekstAntwoord = tekstAntwoord;
        this.studentnaam = studentnaam;
    }

    public String getTekstAntwoord(){
        return tekstAntwoord;
    }

    public String getStudentnaam(){
        return studentnaam;
    }
}
