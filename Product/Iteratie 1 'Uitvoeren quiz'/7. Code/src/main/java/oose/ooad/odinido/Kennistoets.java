package oose.ooad.odinido;

import java.util.ArrayList;

public class Kennistoets {
    private String toetscode;
    private String titel;
    private ArrayList<Vraag> vragen;

    public Kennistoets(String toetscode, String titel, ArrayList vragen) {
        this.toetscode = toetscode;
        this.titel =titel;
        this.vragen = vragen;
    }

    public ArrayList<Vraag> getVragen(){
        return vragen;
    }

    public String toString(){
        return toetscode + " " + titel + " " + vragen.toString();
    }

    public String getVraagData(Vraag v) {
        return v.toString();
    }
}
