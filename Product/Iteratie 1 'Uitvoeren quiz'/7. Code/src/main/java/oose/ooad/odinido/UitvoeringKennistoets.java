package oose.ooad.odinido;


public class UitvoeringKennistoets extends  Uitvoering {

    public UitvoeringKennistoets(int tijd, Kennistoets kennistoets) {
        super(tijd, kennistoets);
    }


    @Override
    public void uitvoerenToets(String naam) {
        Student student = new Student(naam);
        voegUitvoerendeToe(student);
        student.uitvoerenKennistoets(kennistoets);
    }

    protected void voegUitvoerendeToe(Uitvoerende uitvoerende) {
        uitvoerenden.add(uitvoerende);
    }
}
