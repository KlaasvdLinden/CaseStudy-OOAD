package oose.ooad.odinido;

import java.util.ArrayList;

public class UitvoeringKennistoets {
    private long tijd;
    private Kennistoets kennistoets;
    private ArrayList<Student> studenten;

    public UitvoeringKennistoets(Kennistoets kennistoets) {
        this.kennistoets = kennistoets;
        this.studenten = new ArrayList<Student>();
    }

    public void voegStudentToe(Student student){
        studenten.add(student);
    }

    public void uitvoerenKennistoets(String studentnaam){
        Student student = new Student(studentnaam);
        voegStudentToe(student);
        student.uitvoerenKennistoets(kennistoets);
    }
}
