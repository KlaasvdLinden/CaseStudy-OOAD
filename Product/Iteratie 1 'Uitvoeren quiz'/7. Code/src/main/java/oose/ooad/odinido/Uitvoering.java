package oose.ooad.odinido;

import java.util.ArrayList;

public abstract class Uitvoering {
    protected  boolean inUitvoering = false;
    protected int tijd;
    protected int id;
    protected Kennistoets kennistoets;
    protected ArrayList<Uitvoerende> uitvoerenden;

    Uitvoering(int tijd, Kennistoets kennistoets){
        this.tijd = tijd;
        this.kennistoets = kennistoets;
        this.uitvoerenden = new ArrayList<Uitvoerende>();
    }

    public Kennistoets getKennistoets(){
        return kennistoets;
    }

    public void beginKennistoets(){
       setInUitvoering(true);
    }

    private void setInUitvoering(boolean inUitvoering){
        this.inUitvoering = inUitvoering;
    }

    public abstract void uitvoerenToets(String naam);

    protected abstract  void voegUitvoerendeToe(Uitvoerende uitvoerende);


}
