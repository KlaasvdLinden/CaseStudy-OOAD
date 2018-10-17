package oose.ooad.odinido;

import java.util.ArrayList;

public class Lokaal {

    private String code;
    private ArrayList<Student> studenten;


    public Lokaal(String code) {
        this.code = code;
        studenten = new ArrayList<Student>();
    }

    public String getCode() {
        return code;
    }

    public void voegStudentToe(Student student) {
        studenten.add(student);
    }

    public void uitvoerenKennistoets(String studentnaam, Kennistoets kennistoets) {
        Student student = new Student(studentnaam);
        voegStudentToe(student);
        student.uitvoerenKennistoets(kennistoets);
    }

}
