package oose.ooad.odinido;

import java.util.ArrayList;

public class TestData {
    private Kennistoets kennistoets;
    private Uitvoering uitvoering;
    private ArrayList<Vraag> vragen;
    private ArrayList alternatieven;
    private ArrayList tekstAntwoorden;

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
                add(new KortAntwoordVraag(3, "Welke term wordt gebruikt voor ‘the ability to describe and follow the life of a requirement, in both\n" +
                        "forwards and backwards direction’?"
                        , tekstAntwoorden = new ArrayList<TekstAntwoord>() {{
                    add(new TekstAntwoord("traceability"));
                    add(new TekstAntwoord("tracebility"));
                    add(new TekstAntwoord("traceabillity"));
                    add(new TekstAntwoord("tracebillity"));
                }}));
            }};
        }
        String titel = "Requirements";
        String kennistoetsCode = "ODI-23644129";
        kennistoets = new Kennistoets(kennistoetsCode, titel, vragen);
        uitvoering = new UitvoeringKennistoets(10, kennistoets);


    }

    public Kennistoets getKennistoets(){
        return kennistoets;
    }

    public String toSring() {
        return kennistoets.toString();
    }


    public Uitvoering getUitvoering() {
        return uitvoering;
    }
}
