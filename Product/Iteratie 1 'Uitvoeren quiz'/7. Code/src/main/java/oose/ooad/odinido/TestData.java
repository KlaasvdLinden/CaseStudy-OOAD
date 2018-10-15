package oose.ooad.odinido;

import java.util.ArrayList;

public class TestData {
    private Kennistoets kennistoets;
    private Lokaal lokaal;
    private ArrayList<Vraag> vragen;
    private ArrayList alternatieven;

    public TestData() {
        {
            vragen = new ArrayList<Vraag>() {{
                add( new MeerkeuzeVraag(1, "Welke van de begrippen needs, features en requirements horen bij het solution domain?"
                        , alternatieven = new ArrayList<Alternatief>() {{
                    add(new Alternatief(false, "needs, features en requirements", "A"));
                    add(new Alternatief(false, "needs en requirements", "B"));
                    add(new Alternatief(true, "features en requirements", "C"));
                }}));
                add(new MeerkeuzeVraag(2, "Wat wordt bedoeld met ‘elicit needs from stakeholders’?"
                        , alternatieven = new ArrayList<Alternatief>() {{
                    add(new Alternatief(true, "Het boven tafel krijgen van de needs van belanghebbenden", "A"));
                    add(new Alternatief(false, "Het documenteren van de needs van belanghebbenden.", "B"));
                    add(new Alternatief(false, "Het valideren van de needs van belanghebbenden.", "C"));
                }}));
            }};
        }
        String titel = "Requirements";
        String kennistoetsCode = "ODI-23644129";
        kennistoets = new Kennistoets(kennistoetsCode, titel, vragen);

        String lokaalCode = "123AB";
        lokaal = new Lokaal(lokaalCode);
    }

    public Lokaal getLokaal(){
        return lokaal;
    }
    public Kennistoets getKennistoets(){
        return kennistoets;
    }

    public String toSring() {
        return kennistoets.toString();
    }


}
