package oose.ooad.odinido;

import java.util.ArrayList;

public class Lokaal {

    private String code;
    private UitvoeringKennistoets uitvoeringKennistoets;
    private ArrayList<Student> studenten;


    public Lokaal(String code, UitvoeringKennistoets uitvoeringKennistoets) {
        this.code = code;
        this.uitvoeringKennistoets = uitvoeringKennistoets;
        studenten = new ArrayList<Student>();
    }

    public String getCode() {
        return code;
    }

    public void voegStudentToe(Student student) {
        studenten.add(student);
    }

    public void uitvoerenKennistoets(String studentnaam) {
        Student student = new Student(studentnaam);
        voegStudentToe(student);
        Kennistoets toets = uitvoeringKennistoets.getKennistoets();
        student.uitvoerenKennistoets(toets);
    }

}
