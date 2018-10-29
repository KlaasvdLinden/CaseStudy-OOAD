package oose.ooad.odinido;

import java.util.ArrayList;

public class Lokaal {

    private String code;
    private UitvoeringKennistoets uitvoeringKennistoets;


    public Lokaal(String code, UitvoeringKennistoets uitvoeringKennistoets) {
        this.code = code;
        this.uitvoeringKennistoets = uitvoeringKennistoets;
    }

    public String getCode() {
        return code;
    }


    public void uitvoerenKennistoets(String studentnaam) {
        uitvoeringKennistoets.uitvoerenKennistoets(studentnaam);
    }

}
