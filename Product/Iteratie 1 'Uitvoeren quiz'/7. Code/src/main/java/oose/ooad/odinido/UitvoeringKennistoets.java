package oose.ooad.odinido;

public class UitvoeringKennistoets {
    private long tijd;
    private Kennistoets kennistoets;

    public UitvoeringKennistoets(Kennistoets kennistoets) {
        this.kennistoets = kennistoets;
    }

    public Kennistoets getKennistoets() {
        return kennistoets;
    }
}
