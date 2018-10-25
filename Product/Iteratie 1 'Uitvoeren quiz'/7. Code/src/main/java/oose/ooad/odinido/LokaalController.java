package oose.ooad.odinido;

import java.util.ArrayList;

public class LokaalController {

    private ArrayList<Lokaal> lokalen;

    LokaalController(Lokaal lokaal){
        this.lokalen = new ArrayList<Lokaal>();
        lokalen.add(lokaal);
    }

    public Lokaal getLokaal(String code){
        for(Lokaal lokaal : lokalen) {
            if (lokaal.getCode().equals(code)) {
                return lokaal;
            }
        }
        return null;
    }

    public void uitvoerenKennistoets(String lokaalcode, String studentnaam){
        Lokaal lokaal = getLokaal(lokaalcode);
        lokaal.uitvoerenKennistoets(studentnaam);
    }
}
