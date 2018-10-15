package oose.ooad.odinido;

public class UitvoeringKennistoets {
    private long tijd;
    private Kennistoets kennistoets;
    private Lokaal lokaal;

    public UitvoeringKennistoets(Kennistoets kennistoets, Lokaal lokaal) {
        this.kennistoets = kennistoets;
        this.lokaal = lokaal;
    }

    public void uitvoerenKennistoets(String lokaalCode, String studentennaam){
        Lokaal l = getLokaal(lokaalCode);
        Kennistoets k = getKennistoets();
        l.uitvoerenKennistoets(studentennaam, kennistoets);
    }

    public Lokaal getLokaal(String lokaalCode) {
        if (lokaal.getCode().equals(lokaalCode)) {
            return lokaal;
        } else {
            return null;
        }
    }

    public Kennistoets getKennistoets() {
        return kennistoets;
    }
}
