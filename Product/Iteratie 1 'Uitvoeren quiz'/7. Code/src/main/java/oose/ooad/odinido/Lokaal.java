package oose.ooad.odinido;


public class Lokaal {

    private String code;
    private Uitvoering uitvoering;


    public Lokaal(String code, Uitvoering uitvoering) {
        this.code = code;
        this.uitvoering = uitvoering;
    }

    public String getCode() {
        return code;
    }


    public void uitvoerenKennistoets(String naam) {
        uitvoering.uitvoerenToets(naam);
    }

}
